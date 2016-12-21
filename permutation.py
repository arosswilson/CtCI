# given two strings, write a method to decide if one is permutation of the other

def check_permutation(string1, string2):
    if len(string1) != len(string2):
        return False

    return sorted(string1) == sorted(string2)


string1 = 'abcde'
string2 = 'edcba'
string3 = 'alkdakjfe'
string4 = 'alaleeee4'
print(check_permutation(string1, string2))
print(check_permutation(string3, string4))

