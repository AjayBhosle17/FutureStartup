def Single_num(arr):
    num=0
    for i in range(0,len(arr)):
        num=num^arr[i]
    return num

test_case_1 = [2,2,1]
test_case_2 = [4,1,2,1,2]
test_case_3 = [1]

print("--- test case 1 ---")
print(f"Input: nums = {test_case_1}\nOutput: {Single_num(test_case_1)}")
print("--- test case 2 ---")
print(f"Input: nums = {test_case_2}\nOutput: {Single_num(test_case_2)}")
print("--- test case 3 ---")
print(f"Input: nums = {test_case_3}\nOutput: {Single_num(test_case_3)}")