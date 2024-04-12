import random

def selection_sort(my_list):
    for i in range(len(my_list) - 1):
        min_idx = i
        for j in range(i + 1, len(my_list)):
            if my_list[j] < my_list[min_idx]:
                min_idx = j
        my_list[i], my_list[min_idx] = my_list[min_idx], my_list[i]
    return my_list


my_list = list()
for _ in range(10):
    my_list.append(random.randrange(1, 15))

print("정렬 전: ")
print(my_list)

print("정렬 후:")
print(selection_sort(my_list))
