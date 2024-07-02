class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        # Step 1: Count the elements in both arrays
        counts1 = Counter(nums1)
        counts2 = Counter(nums2)
    
        # Step 2: Find the intersection
        intersection = []
        for element in counts1:
            if element in counts2:
                # Step 3: Add the element min(counts1[element], counts2[element]) times to the result
                intersection.extend([element] * min(counts1[element], counts2[element]))
    
        return intersection
