def maxsum(nums):
    currsum = nums[0]
    bestsum = nums[0]
    for i in range(1, len(nums)):
        currsum = max(nums[i], currsum + nums[i])
        bestsum = max(currsum, bestsum)
    return bestsum

inp = input("Enter numbers separated by spaces: ")
nums = list(map(int, inp.split()))

result = maxsum(nums)
print("Maximum sum: ", result)