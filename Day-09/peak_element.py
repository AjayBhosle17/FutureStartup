def peak(test_data):
    start=0
    end=len(test_data)-1
    
    for i in range(0,len(test_data)):

        mid= start + (end-start)//2

        if(test_data[mid]<test_data[mid+1]):
            start=mid+1
        else:
            end=mid
    return start


test_case_1 = [1,2,3,1]
test_case_2 = [1,2,1,3,5,6,4]

print("--- test case 1 ---");
print(f"Input: nums = {test_case_1}\nOutput: {peak(test_case_1)}")
print("--- test case 2 ---")
print(f"Input: nums = {test_case_2}\nOutput: {peak(test_case_2)}")

