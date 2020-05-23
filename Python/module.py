# -*- coding: utf-8 -*-
import os
import bash


def build(module_name, module_path):
    styled_name = bash.style(f"[{module_name}]", True, "cyan")
    os.system(f"echo \"==> Build do Módulo {styled_name} ...\"")
    os.chdir(os.path.join(os.path.dirname(__file__), module_path))
    os.system("./gradlew assembleDebug")
