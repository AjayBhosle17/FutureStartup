def position(test_case,target):
    
    start = 0
    end = len(test_case)-1
    while(start<end):
        mid = int(start + (end-start)/2)
        if (test_case[mid] == target):
            return mid
        if(test_case[mid] > target):
            end = mid-1
        else:
            start = mid+1
    return start+1


test_case_1 = [1,3,5,6]
target_1 = 5
test_case_2 = [1,3,5,6]
target_2 = 2
test_case_3 = [1,3,5,6]
target_3 = 7

print("--- test case 1 ---")
print(f"Input: nums = {test_case_1} , target = {target_1}\nOutput: {position(test_case_1,target_1)}")
print("--- test case 2 ---")
print(f"Input: nums = {test_case_2} , target = {target_2}\nOutput: {position(test_case_2,target_2)}")
print("--- test case 3 ---")
print(f"Input: nums = {test_case_3} , target = {target_3}\nOutput: {position(test_case_3,target_3)}")