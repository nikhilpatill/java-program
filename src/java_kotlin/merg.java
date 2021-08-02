package java_kotlin;

public class merg {
    static void dis(int a[], int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = low;
        int b[] = new int[100];

        while(i<=mid && j<=high) {     //   <=  &&  <=
            if (a[i] < a[j]) {         //     <
                b[k] = a[i];
                i++;
                k++;
            } else {
                b[k] = a[j];
                j++;
                k++;
            }
        }

             while(i<=mid )                   // i<=mid
             {
                 b[k]=a[i];
                 i++;
                 k++;
             }

            while(j<=high)//                  j<=mid
            {
                b[k]=a[j];
                j++;
                k++;
            }



        for(i=low;i<=high;i++) //               i<=high
        {
                 a[i]=b[i];
        }
    }

    static void m_sort(int a[], int low ,int high) {
        int mid;
        if (low < high) {                          //         low<high
            mid=(low+high)/2;
            m_sort(a, low, mid);
            m_sort(a, mid + 1, high);
            dis(a, low, mid, high);
        }
    }

    static void print(int a[],int n)
    {
        int i;
        for( i=0;i<n;i++)
        {

           System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int a[]={3,2,1};
        int n=a.length;
        print(a,n);
        m_sort(a,0,n-1);
        print(a,n);
    }
}