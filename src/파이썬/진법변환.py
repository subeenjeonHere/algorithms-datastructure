n, b = input().split(" ")
li = [n, b]


def alpha_to_decimal(a):
    res = ord(a) - ord('A') + 10
    deci_to_t(res)
    print(type(res))


def deci_to_t(res):
    # a = bin(res)[2:]
    print(res)

    for i in range(0, len(li)):
        string = li[i].split()
    for j in string:
        al = list(j)
    for k in al:
        alpha_to_decimal(k)
