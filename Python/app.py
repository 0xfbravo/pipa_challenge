# -*- coding: utf-8 -*-
import os
import platform
import bash

app_color = "red"


def build(app_name: str, app_path: str):
    command = "gradlew" if platform.system() == "Windows" else "./gradlew"
    styled_name = bash.style(f"[{app_name}]", True, app_color)
    os.system(f"echo \"=> Build do Aplicativo {styled_name}\"")
    os.chdir(os.path.join(os.path.dirname(__file__), app_path))
    os.system(f"{command} assembleDebug")


def install(app_name: str, android_tools_path: str, build_path: str):
    command = "adb" if platform.system() == "Windows" else "./adb"
    styled_name = bash.style(f"[{app_name}]", True, app_color)
    os.system(f"echo \"=> Instalando o aplicativo {styled_name}\"")
    os.chdir(android_tools_path)
    os.system(f"{command} install -r -t {os.path.join(os.path.dirname(__file__), build_path)}")


def run(app_name: str, android_tools_path: str, app_main_canonical_path: str):
    command = "adb" if platform.system() == "Windows" else "./adb"
    styled_name = bash.style(f"[{app_name}]", True, app_color)
    os.system(f"echo \"=> Executando o aplicativo {styled_name}\"")
    os.chdir(android_tools_path)
    os.system(f"{command} shell am start -n \"{app_main_canonical_path}\" -a android.intent.action.MAIN")
