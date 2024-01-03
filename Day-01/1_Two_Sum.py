def two_sum(test_case,target):
    for i in range(len(test_case)):
        for j in range(i+1,len(test_case)):
            if(test_case[i]+test_case[j]==target):
                return list([i,j])            

test_case_1 = [2,7,11,15]
target_1 = 9
test_case_2 = [3,2,4]
target_2 = 6
test_case_3 = [3,3]
target_3 = 6

print("--- test case 1 ---")
print(f"Input: nums = {test_case_1}\nOutput: {two_sum(test_case_1,target_1)}")
print("--- test case 2 ---")
print(f"Input: nums = {test_case_2}\nOutput: {two_sum(test_case_3,target_3)}")
print("--- test case 2 ---")
print(f"Input: nums = {test_case_3}\nOutput: {two_sum(test_case_3,target_3)}")