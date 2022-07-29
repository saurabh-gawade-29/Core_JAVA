package Lecture11;

public class MirrorInverse {
    static boolean isMirrorInverse(int arr[])
    {
        for (int i = 0; i<arr.length; i++) {
// If condition fails for any element
            if (arr[arr[i]] != i)
                return false;
        }
// Given array is mirror-inverse
        return true;
    }

    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 3, 0 };
        if (isMirrorInverse(arr))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
