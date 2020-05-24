# -*- coding: utf-8 -*-
import os
import bash
import platform
import shutil


def build(module_name: str, module_path: str):
    command = "gradlew" if platform.system() == "Windows" else "./gradlew"
    styled_name = bash.style(f"[{module_name}]", True, "cyan")
    os.system(f"echo \"=> Build do Módulo {styled_name}\"")
    os.chdir(os.path.join(os.path.dirname(__file__), module_path))
    os.system(f"{command} assembleDebug")


def copy(module_name:str, build_path: str, destination_path: str):
    styled_name = bash.style(f"[{module_name}]", True, "cyan")
    os.system(f"echo \"=> Copiando o Módulo {styled_name}\"")
    current_build_path = os.path.join(os.path.dirname(__file__), build_path)
    destination_full_path = os.path.join(os.path.dirname(__file__), destination_path)
    shutil.copyfile(current_build_path, destination_full_path)
