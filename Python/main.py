# -*- coding: utf-8 -*-
from config import project_config as pc
import module
import app


def main():
    # Reads project-config.json
    config = pc.read()

    # Helpful variables
    module_name = config['moduleName']
    module_path = config['modulePath']
    module_artifact_build_path = config['moduleArtifactBuildPath']
    module_artifact_destination_path = config['moduleArtifactDestinationPath']
    app_name = config['appName']
    app_path = config['appPath']

    # Module and Application build
    module.build(module_name, module_path)
    module.copy(module_artifact_build_path, module_artifact_destination_path)
    app.build(app_name, app_path)


if __name__ == '__main__':
    main()
