
def Palindrome(data):

    num=data;
    sum=0;
    if(data<0):
        return False
    while(data!=0):
        sum=sum*10 +data%10;
        data//=10;
    return num==sum

test_case_1 = 121
test_case_2 = -121
test_case_3 = 10 

print("--- test case 1 ---");
print(f"Input: nums = {test_case_1}\nOutput: {Palindrome(test_case_1)}")
print("--- test case 2 ---")
print(f"Input: nums = {test_case_2}\nOutput: {Palindrome(test_case_2)}")
print("--- test case 3 ---")
print(f"Input: nums = {test_case_3}\nOutput: {Palindrome(test_case_3)}")

