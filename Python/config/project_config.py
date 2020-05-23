# -*- coding: utf-8 -*-
import json
import os


def read():
    os.system("echo == Lendo o arquivo de configurações...")
    with open(os.path.join(os.path.dirname(__file__), 'project-config.json'), 'r') as f:
        return json.load(f)
