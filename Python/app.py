# -*- coding: utf-8 -*-
import os
import bash

app_color = "red"


def build(app_name: str, app_path: str):
    styled_name = bash.style(f"[{app_name}]", True, app_color)
    os.system(f"echo \"=> Build do Aplicativo {styled_name}...\"")
    os.chdir(os.path.join(os.path.dirname(__file__), app_path))
    os.system("./gradlew assembleDebug")


def install(app_name: str, android_tools_path: str, build_path: str):
    # Installs .APK
    styled_name = bash.style(f"[{app_name}]", True, app_color)
    os.system(f"echo \"=> Instalando o aplicativo {styled_name}...\"")
    os.chdir(android_tools_path)
    os.system(f"./adb install -r -t {os.path.join(os.path.dirname(__file__), build_path)}")


def run(app_name: str, android_tools_path: str, app_main_canonical_path: str):
    styled_name = bash.style(f"[{app_name}]", True, app_color)
    os.system(f"echo \"=> Executando o aplicativo {styled_name}...\"")
    os.chdir(android_tools_path)
    os.system(f"./adb shell am start -n \"{app_main_canonical_path}\" -a android.intent.action.MAIN")
