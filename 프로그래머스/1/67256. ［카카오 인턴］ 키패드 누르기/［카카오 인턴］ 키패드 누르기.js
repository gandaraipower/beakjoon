function solution(numbers, hand) {
  var answer = "";
  let arr = [
    [1, 0, 0],
    [2, 1, 0],
    [3, 2, 0],
    [4, 0, 1],
    [5, 1, 1],
    [6, 2, 1],
    [7, 0, 2],
    [8, 1, 2],
    [9, 2, 2],
    [10, 0, 3],
    [0, 1, 3],
    [11, 2, 3],
  ]; //배열에 위치 정보를 다넣음 같은 자료형만 들어가니까 *=10 #=11
  var leftPlace = [10, 0, 3];
  var nextPlace = [];
  var rightPlace = [11, 2, 3];

  console.log(`처음 왼손 위치:${leftPlace}`);
  console.log(`처음 오른손 위치:${rightPlace}`);

  for (i = 0; i < numbers.length; i++) {
    for (j = 0; j < 12; j++) {
      if (numbers[i] == arr[j][0]) {
        nextPlace = arr[j];
        console.log(`다음 위치:${nextPlace}`);
        var lengthLeft = lengthSearch(leftPlace, nextPlace);
        var lengthRight = lengthSearch(rightPlace, nextPlace);
        if (
          nextPlace[0] == 0 ||
          nextPlace[0] == 2 ||
          nextPlace[0] == 5 ||
          nextPlace[0] == 8
        ) {
          if (lengthLeft < lengthRight) {
            leftPlace = nextPlace;
            console.log(`왼손이 움직임:${leftPlace}`);
            answer += "L";
          } else if (lengthLeft > lengthRight) {
            rightPlace = nextPlace;
            console.log(`오른손이 움직임:${rightPlace}`);
            answer += "R";
          } else {
            if (hand == "left") {
              leftPlace = nextPlace;
              console.log(`왼손이 움직임:${leftPlace}`);
              answer += "L";
            } else {
              rightPlace = nextPlace;
              console.log(`오른손이 움직임:${rightPlace}`);
              answer += "R";
            }
          } //이러면 손의 위치를 옮기기는 했어 이걸 반복하면 되나?
        } //일단 전의 위치와 다음 위치의 왼손 오른손 각각의 거리를 구한다...
        else if (nextPlace[0] == 1 || nextPlace[0] == 4 || nextPlace[0] == 7) {
          leftPlace = nextPlace;
          console.log(`왼손이 움직임:${leftPlace}`);
          answer += "L";
        } else if (
          nextPlace[0] == 3 ||
          nextPlace[0] == 6 ||
          nextPlace[0] == 9
        ) {
          rightPlace = nextPlace;
          console.log(`오른손이 움직임:${rightPlace}`);
          answer += "R";
        }
      }
    }
  }
  console.log(answer);
  return answer;
}

const lengthSearch = (a, b) => {
  var length1 = a[1] - b[1];
  if (length1 < 0) {
    length1 = -length1;
  }
  var length2 = a[2] - b[2];
  if (length2 < 0) {
    length2 = -length2;
  }

  return length1 + length2;
};
