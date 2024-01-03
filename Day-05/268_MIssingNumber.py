def MissingNumber(test_case):
    num = len(test_case) * (len(test_case) +1 )/2

    for i in range(len(test_case)-1,-1,-1):
        num=num-test_case[i]

    return num
        
test_case_1 = [1,2,3]
test_case_2 = [0,1]
test_case_3 = [9,6,4,2,3,5,7,0,1];

print("--- test case 1 ---");
print(f"Input: nums = {test_case_1}\nOutput: {MissingNumber(test_case_1)}")
print("--- test case 2 ---")
print(f"Input: nums = {test_case_2}\nOutput: {MissingNumber(test_case_2)}")
print("--- test case 3 ---")
print(f"Input: nums = {test_case_3}\nOutput: {MissingNumber(test_case_3)}")