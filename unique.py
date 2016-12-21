def unique(string):
    if len(string) > 128:
        return False

    char_set = [False for _ in range(128)]

    for char in string:
        if char_set[char]:
            return False
        else:
            char_set[char] = True

    return True
