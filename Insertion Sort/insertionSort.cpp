#include <iostream>

using namespace std;

int main()
{
    int a[5], key, i, j;
    cin >> a[0] >> a[1] >> a[2] >> a[3] >> a[4];

    // cout << a; what happens here?? 0x7ffee71348d0

    for (j = 1; j < 5; j++)

    {
        key = a[j];

        i = j - 1;

        while (i >= 0 && a[i] > key)
        {
            a[i + 1] = a[i];
            i = i - 1;
        }
        a[i + 1] = key;
    }

    for (i = 0; i < 5; i++)
    {
        cout << a[i] << " ";
    }
    return 0;
}