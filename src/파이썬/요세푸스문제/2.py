n, k = map(int, input().split(" "))
# list에 1부터 n까지 할당

li = list((0 for i in range(n)))
for i in range(0, len(li)):
    li[i] = i + 1

print(li)
