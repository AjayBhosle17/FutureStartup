def lengthOfLongestSubstring(s):
    ls = []
    max = 0
    for i in s:
        if i in ls:
            if len(ls)>max:
                max=len(ls)
            ls.clear()
        ls.append(i)
    return max

s1 = "abcabcbb"
s2 = "bbbbb"
s3 = "pwwkew"

print("-- test case 1 --")
print(f"input : {s1}\nOutput : {lengthOfLongestSubstring(s1)}")
print("-- test case 2 --")
print(f"input : {s2}\nOutput : {lengthOfLongestSubstring(s2)}")
print("-- test case 3 --")
print(f"input : {s3}\nOutput : {lengthOfLongestSubstring(s3)}")