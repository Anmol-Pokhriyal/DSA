#include <stdio.h>
#include <conio.h>

void RevinsertionSort(int arr[], int n){
    int i, z, j;
    for (i = 1; i < n; i++) {
        z = arr[i];
        j = i - 1;
        while (j >= 0 && arr[j] < z) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = z;
    }
}
void print(int arr[], int n)
{
    int i;
    printf("Elements in decreasing order  = ");
    for (i = 0; i < n; i++)
        printf("%d ", arr[i]);
    printf("\n");
}

void oddPosition(int arr[], int n){
    int i;
    printf("The positions of the odd elements in sorted array are = ");
    for(i = 0; i < n; i++){
        if(arr[i] % 2 != 0){
            printf("%d ", i);
        }
    }
}
int main() {
    int n, i;
    printf("Enter the size of an array = ");
    scanf("%d", &n);
    int arr[n];
    printf("Enter the array elements = ");
    for(i=0;i<n;i++){
        scanf("%d", &arr[i]);
    }
 
    RevinsertionSort(arr, n);
    print(arr, n);
    oddPosition(arr,n);
    return 0;
}

