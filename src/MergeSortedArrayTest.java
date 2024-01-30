import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MergeSortedArrayTest {

    @Test
    public void example1(){
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        nums1 = MergeSortedArray.merge(nums1, m, nums2, n);
        assertArrayEquals(nums1, new int[]{1,2,2,3,5,6});
    }
    @Test
    public void example2(){
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        nums1 = MergeSortedArray.merge(nums1, m, nums2, n);
        assertArrayEquals(nums1, new int[]{1});
    }
    @Test
    public void example3(){
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        nums1 = MergeSortedArray.merge(nums1, m, nums2, n);
        assertArrayEquals(nums1, new int[]{1});
    }
}
