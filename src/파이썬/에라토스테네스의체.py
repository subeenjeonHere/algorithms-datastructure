n, k = map(int, input().split(" "))
li = list()

# 2부터 배열 생성
for i in range(2, n + 1):
    li.append(i)

cnt = 0
for i in range(len(li)):
    if li[i] == 0:
        continue
    p = li[i]
    for j in range(i, len(li)):
        # if j == le:
        #     continue
        # if li[j] % p == 0:
        #     print("Li[j]", li[j])
        #     cnt += 1
        #     if cnt == k:
        #         print(li[j])
        #
        #     li.remove(li[j])
        #     le = len(li)
        ele = li[j]
        if li[j] % p == 0 and li[j] != 0:
            cnt += 1
            if cnt == k:
                print(li[j])
            li[j] = 0
# for loop 내에서 List 길이 줄어드므로 index 에러 발생함
