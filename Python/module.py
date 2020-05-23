# -*- coding: utf-8 -*-
import os


def build(module_name, module_path):
    os.system(f"echo == Build do Módulo [{module_name}] ...")
    os.chdir(os.path.join(os.path.dirname(__file__), module_path))
    os.system("./gradlew assembleDebug")
    os.system("echo ==")
