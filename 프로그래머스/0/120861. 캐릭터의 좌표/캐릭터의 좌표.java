class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int x=0;
        int y=0;
        int xRange=board[0]/2; //5
        int yRange=board[1]/2; //5
        //-1,0 0,0 0,1 1,1 2,1
        for(String cmd:keyinput){
            switch(cmd){
                case "up": {
                    y++;
                    if(y>yRange){
                        y--;
                    }
                    System.out.println(y);
                break;
                }
                case "down":{
                    y--;
                    if(y<-yRange){
                        y++;
                    }
                    System.out.println(y);
                break;
                }
                case "left":{
                    x--;
                    if(x<-xRange){
                        x++;
                    }
                    System.out.println(x);
                break;
                }
                case "right":{
                    x++;
                    if(x>xRange){
                        x--;
                    }
                    System.out.println(x);
                break;
                }        
            }
        }
        answer[0]=x;
        answer[1]=y;
        
        return answer;
    }
    
}