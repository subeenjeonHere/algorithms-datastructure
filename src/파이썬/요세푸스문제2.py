n, k = map(int, input().split(" "))

# list에 1부터 n까지 할당
li = list(0 for i in range(n))
for i in range(0, len(li)):
    li[i] = i + 1

k -= 1
i = 0
dix = 0

result = list()

while len(li) != 0:
    dix = int(k / len(li))
    if i + k > len(li):
        newI = 0
        h1 = len(li) - i
        h2 = k - h1
        newI = h1 + h2
        if newI > k:
            i = int(newI % k)
        else:
            i = int(newI / k) - 1
        del li[i]
    else:
        h = k % len(li)
        i += k
        del li[i]
