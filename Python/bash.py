# -*- coding: utf-8 -*-
font_style = {
    "normal": '\\033[0m',
    "bold": '\\033[1m'
}

color = {
    "no_color": '\\033[0m',
    "red": '\\033[0;31m',
    "green": '\\033[0;32m',
    "orange": '\\033[0;33m',
    "blue": '\\033[0;34m',
    "purple": '\\033[0;35m',
    "cyan": '\\033[0;36m',
    "lightgray": '\\033[0;37m',
    "darkgray": '\\033[1;30m',
    "yellow": '\\033[1;33m',
    "white": '\\033[1;37m',
}


def style(text: str, bold: bool, color_name: str):
    if bold:
        text = font_style["bold"] + text

    text = color[color_name] + text
    text = text + color["no_color"] + font_style["normal"]
    return text


def divider():
    return font_style["bold"] + color["lightgray"] + "<===============>" + color["no_color"] + font_style["normal"]
