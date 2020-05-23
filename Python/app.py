# -*- coding: utf-8 -*-
import os
import colors


def build(project_name, project_path):
    os.system(f"echo \"== Build do Aplicativo {colors.color['green']}[{project_name}]{colors.color['no_color']} ...\"")
    os.chdir(os.path.join(os.path.dirname(__file__), project_path))
    os.system("./gradlew assembleDebug")
    os.system("echo \"==\"")
