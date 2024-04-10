n, b = input().split()
li = []

# b를 정수형으로 변환
nb = int(b)
# print(nb)
print(int(n, nb))

# 진수를 변환

# for ch in n:
#     toInt = int(ch, nb)
#     print(toInt)
#     li.append(toInt)
#
# print(li)

# mul = 0
# sum = 0
# st = 0
# for i in range(0, len(li) - 1):
#     while i <= len(li) - 1:
#         nb *= nb
#         i += 1
#     result = li[i] * nb
#     sum += result
