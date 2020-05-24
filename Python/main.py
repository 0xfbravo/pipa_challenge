# -*- coding: utf-8 -*-
from config import project_config as pc
import module
import app
import os
import bash


def main():
    # Reads project-config.json
    config = pc.read()

    # Helpful variables
    tools_path = config['toolsPath']

    module_name = config['moduleName']
    module_path = config['modulePath']
    module_build_path = config['moduleBuildPath']
    module_destination_path = config['moduleDestinationPath']

    app_name = config['appName']
    app_path = config['appPath']
    app_build_path = config['appBuildPath']
    app_main_canonical_path = config['appMainCanonicalPath']

    # Module and Application build
    module.build(module_name, module_path)
    module.copy(module_name, module_build_path, module_destination_path)
    os.system(f"echo \"{bash.divider()}\"")
    app.build(app_name, app_path)
    app.install(app_name, tools_path, app_build_path)
    app.run(app_name, tools_path, app_main_canonical_path)


if __name__ == '__main__':
    main()
