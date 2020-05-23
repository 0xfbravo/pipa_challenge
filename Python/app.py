# -*- coding: utf-8 -*-
import os
import bash


def build(project_name, project_path):
    styled_name = bash.style(f"[{project_name}]", True, "orange")
    os.system(f"echo \"==> Build do Aplicativo {styled_name} ...\"")
    os.chdir(os.path.join(os.path.dirname(__file__), project_path))
    os.system("./gradlew assembleDebug")
