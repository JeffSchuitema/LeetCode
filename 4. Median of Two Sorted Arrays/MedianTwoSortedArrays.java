class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double n = nums1.length;
        double m = nums2.length;
        // Current index of input array ar1[]
        int i = 0;

        // Current index of input array ar2[]
        int j = 0;
        int count;
        double m1 = -1, m2 = -1;

        // Since there are (n+m) elements,
        // There are following two cases
        // if n+m is odd then the middle
        // index is median i.e. (m+n)/2
        if ((m + n) % 2 == 1) {
            for (count = 0; count <= (n + m) / 2; count++) {
                if (i != n && j != m) {
                    m1 = (nums1[i] > nums2[j]) ? nums2[j++]
                            : nums1[i++];
                } else if (i < n) {
                    m1 = nums2[i++];
                }

                // for case when j<m,
                else {
                    m1 = nums2[j++];
                }
            }
            return m1;
        }

        // median will be average of elements
        // at index ((m+n)/2 - 1) and (m+n)/2
        // in the array obtained after merging
        // ar1 and ar2
        else {
            for (count = 0; count <= (n + m) / 2; count++) {
                m2 = m1;
                if (i != n && j != m) {
                    m1 = (nums1[i] > nums2[j]) ? nums2[j++]
                            : nums1[i++];
                } else if (i < n) {
                    m1 = nums1[i++];
                }

                // for case when j<m,
                else {
                    m1 = nums2[j++];
                }
            }
            return (double)((m1 + m2) / 2);
        }
    }
}
