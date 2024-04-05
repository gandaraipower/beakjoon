#include <stdio.h>
#define NUM 30

int main() {
    int n;
    int list[NUM+1] = {0};  // 1부터 30까지의 출석번호를 표시하는 배열
    for (int i = 0; i < 28; i++)  // 28명의 학생의 출석번호를 입력받습니다.
    {
        scanf("%d", &n);
        list[n] = 1;  // 제출한 학생의 출석번호를 배열에서 제거합니다.
    }
    for (int i = 1, count = 0; i <= NUM && count < 2; i++)  // 남은 출석번호 중 가장 작은 두 개를 출력합니다.
    {
        if (list[i] == 0) {
            printf("%d\n", i);
            count++;
        }
    }
    return 0;
}
