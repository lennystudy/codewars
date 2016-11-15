def alphabet_position(text):
    ans = ""
    text = text.lower()
    for c in text:
        if ord(c) - ord('a') >= 0 and ord(c) - ord('a') <= 25:
            ans = ans + str(ord(c) - ord('a') + 1) + " "
    return ans[0:-1]


def alphabet_position(text):
    return ' '.join(str(ord(c) - 96) for c in text.lower() if c.isalpha())

print(alphabet_position(''))


