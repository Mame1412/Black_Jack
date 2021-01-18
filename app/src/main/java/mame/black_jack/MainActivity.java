package mame.black_jack;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageDisplayInitialize();
    }

    public static class num {
        public static int sum = 0;
        public static int start1_random_num = 0;
        public static int start1_display_num = 0;
        public static int start2_random_num = 0;
        public static int start2_display_num = 0;
        public static int hit1_random_num = 0;
        public static int hit1_display_num = 0;
        public static int hit2_random_num = 0;
        public static int hit2_display_num = 0;
        public static int hit3_random_num = 0;
        public static int hit3_display_num = 0;
        public static int hit4_random_num = 0;
        public static int hit4_display_num = 0;
        public static int hit5_random_num = 0;
        public static int hit5_display_num = 0;
    }

    public void imageDisplayInitialize() {

        //Text
        final TextView sumLabel = findViewById(R.id.sumView);
        sumLabel.setText("合計 : 0");
        final TextView sonLabel = findViewById(R.id.sonView);
        sonLabel.setText("");

        //Button
        final Button startButton = (Button) findViewById(R.id.startButton);
        final Button hitButton = (Button) findViewById(R.id.hitButton);
        final Button standButton = (Button) findViewById(R.id.standButton);
        final Button resetButton = (Button) findViewById(R.id.resetButton);

        //Image
        final ImageView startImg1 = findViewById(R.id.startView1);
        startImg1.setImageResource(R.drawable.card0);
        final ImageView startImg2 = findViewById(R.id.startView2);
        startImg2.setImageResource(R.drawable.card0);
        final ImageView hitImg1 = findViewById(R.id.hitView1);
        hitImg1.setImageResource(R.drawable.card0);
        final ImageView hitImg2 = findViewById(R.id.hitView2);
        hitImg2.setImageResource(R.drawable.card0);
        final ImageView hitImg3 = findViewById(R.id.hitView3);
        hitImg3.setImageResource(R.drawable.card0);
        final ImageView hitImg4 = findViewById(R.id.hitView4);
        hitImg4.setImageResource(R.drawable.card0);
        final ImageView hitImg5 = findViewById(R.id.hitView5);
        hitImg5.setImageResource(R.drawable.card0);


        final Random r = new Random();

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                num.start1_random_num = r.nextInt(13) + 1;
                if (num.start1_random_num == 1) {
                    startImg1.setImageResource(R.drawable.card1);
                } else if (num.start1_random_num == 2) {
                    startImg1.setImageResource(R.drawable.card2);
                } else if (num.start1_random_num == 3) {
                    startImg1.setImageResource(R.drawable.card3);
                } else if (num.start1_random_num == 4) {
                    startImg1.setImageResource(R.drawable.card4);
                } else if (num.start1_random_num == 5) {
                    startImg1.setImageResource(R.drawable.card5);
                } else if (num.start1_random_num == 6) {
                    startImg1.setImageResource(R.drawable.card6);
                } else if (num.start1_random_num == 7) {
                    startImg1.setImageResource(R.drawable.card7);
                } else if (num.start1_random_num == 8) {
                    startImg1.setImageResource(R.drawable.card8);
                } else if (num.start1_random_num == 9) {
                    startImg1.setImageResource(R.drawable.card9);
                } else if (num.start1_random_num == 10) {
                    startImg1.setImageResource(R.drawable.card10);
                } else if (num.start1_random_num == 11) {
                    startImg1.setImageResource(R.drawable.card11);
                } else if (num.start1_random_num == 12) {
                    startImg1.setImageResource(R.drawable.card12);
                } else if (num.start1_random_num == 13) {
                    startImg1.setImageResource(R.drawable.card13);
                }
                if (num.start1_random_num >= 10) {
                    num.start1_display_num = 10;
                } else {
                    num.start1_display_num = num.start1_random_num;
                }
                num.sum += num.start1_display_num;

                num.start2_random_num = r.nextInt(13) + 1;
                if (num.start2_random_num == 1) {
                    startImg2.setImageResource(R.drawable.card1);
                } else if (num.start2_random_num == 2) {
                    startImg2.setImageResource(R.drawable.card2);
                } else if (num.start2_random_num == 3) {
                    startImg2.setImageResource(R.drawable.card3);
                } else if (num.start2_random_num == 4) {
                    startImg2.setImageResource(R.drawable.card4);
                } else if (num.start2_random_num == 5) {
                    startImg2.setImageResource(R.drawable.card5);
                } else if (num.start2_random_num == 6) {
                    startImg2.setImageResource(R.drawable.card6);
                } else if (num.start2_random_num == 7) {
                    startImg2.setImageResource(R.drawable.card7);
                } else if (num.start2_random_num == 8) {
                    startImg2.setImageResource(R.drawable.card8);
                } else if (num.start2_random_num == 9) {
                    startImg2.setImageResource(R.drawable.card9);
                } else if (num.start2_random_num == 10) {
                    startImg2.setImageResource(R.drawable.card10);
                } else if (num.start2_random_num == 11) {
                    startImg2.setImageResource(R.drawable.card11);
                } else if (num.start2_random_num == 12) {
                    startImg2.setImageResource(R.drawable.card12);
                } else if (num.start2_random_num == 13) {
                    startImg2.setImageResource(R.drawable.card13);
                }
                if (num.start2_random_num >= 10) {
                    num.start2_display_num = 10;
                } else {
                    num.start2_display_num = num.start2_random_num;
                }
                num.sum += num.start2_display_num;

                sumLabel.setText("合計 : " + num.sum);

                if ((num.start1_display_num == 1) && (num.start2_display_num == 10)) {
                    sonLabel.setText("Black Jack!!");
                } else if ((num.start1_display_num == 10) && (num.start2_display_num == 1)) {
                    sonLabel.setText("Black Jack!!");
                }
            }
        });
        
        hitButton.setOnClickListener(new View.OnClickListener() {
            int i = 0;
            @Override public void onClick(View view) {
                if (i == 0) {
                    i = 1;num.hit1_random_num = r.nextInt(13) + 1;
                    if (num.hit1_random_num == 1) {
                        hitImg1.setImageResource(R.drawable.card1);
                    } else if (num.hit1_random_num == 2) {
                        hitImg1.setImageResource(R.drawable.card2);
                    } else if (num.hit1_random_num == 3) {
                        hitImg1.setImageResource(R.drawable.card3);
                    } else if (num.hit1_random_num == 4) {
                        hitImg1.setImageResource(R.drawable.card4);
                    } else if (num.hit1_random_num == 5) {
                        hitImg1.setImageResource(R.drawable.card5);
                    } else if (num.hit1_random_num == 6) {
                        hitImg1.setImageResource(R.drawable.card6);
                    } else if (num.hit1_random_num == 7) {
                        hitImg1.setImageResource(R.drawable.card7);
                    } else if (num.hit1_random_num == 8) {
                        hitImg1.setImageResource(R.drawable.card8);
                    } else if (num.hit1_random_num == 9) {
                        hitImg1.setImageResource(R.drawable.card9);
                    } else if (num.hit1_random_num == 10) {
                        hitImg1.setImageResource(R.drawable.card10);
                    } else if (num.hit1_random_num == 11) {
                        hitImg1.setImageResource(R.drawable.card11);
                    } else if (num.hit1_random_num == 12) {
                        hitImg1.setImageResource(R.drawable.card12);
                    } else if (num.hit1_random_num == 13) {
                        hitImg1.setImageResource(R.drawable.card13);
                    }
                    if (num.hit1_random_num >= 10) {
                        num.hit1_display_num = 10;
                    } else {
                        num.hit1_display_num = num.hit1_random_num;
                    }
                    num.sum += num.hit1_display_num;

                    sumLabel.setText("合計 : " + num.sum);

                    if (num.sum >= 22) {
                        sonLabel.setText("Bust");
                    }
                } else if (i == 1){
                    i = 2;
                    num.hit2_random_num = r.nextInt(13) + 1;
                    if (num.hit2_random_num == 1) {
                        hitImg2.setImageResource(R.drawable.card1);
                    } else if (num.hit2_random_num == 2) {
                        hitImg2.setImageResource(R.drawable.card2);
                    } else if (num.hit2_random_num == 3) {
                        hitImg2.setImageResource(R.drawable.card3);
                    } else if (num.hit2_random_num == 4) {
                        hitImg2.setImageResource(R.drawable.card4);
                    } else if (num.hit2_random_num == 5) {
                        hitImg2.setImageResource(R.drawable.card5);
                    } else if (num.hit2_random_num == 6) {
                        hitImg2.setImageResource(R.drawable.card6);
                    } else if (num.hit2_random_num == 7) {
                        hitImg2.setImageResource(R.drawable.card7);
                    } else if (num.hit2_random_num == 8) {
                        hitImg2.setImageResource(R.drawable.card8);
                    } else if (num.hit2_random_num == 9) {
                        hitImg2.setImageResource(R.drawable.card9);
                    } else if (num.hit2_random_num == 10) {
                        hitImg2.setImageResource(R.drawable.card10);
                    } else if (num.hit2_random_num == 11) {
                        hitImg2.setImageResource(R.drawable.card11);
                    } else if (num.hit2_random_num == 12) {
                        hitImg2.setImageResource(R.drawable.card12);
                    } else if (num.hit2_random_num == 13) {
                        hitImg2.setImageResource(R.drawable.card13);
                    }
                    if (num.hit2_random_num >= 10) {
                        num.hit2_display_num = 10;
                    } else {
                        num.hit2_display_num = num.hit2_random_num;
                    }
                    num.sum += num.hit2_display_num;

                    sumLabel.setText("合計 : " + num.sum);

                    if (num.sum >= 22) {
                        sonLabel.setText("Bust");
                    }
                } else if (i == 2) {
                    i = 3;
                    num.hit3_random_num = r.nextInt(13) + 1;
                    if (num.hit3_random_num == 1) {
                        hitImg3.setImageResource(R.drawable.card1);
                    } else if (num.hit3_random_num == 2) {
                        hitImg3.setImageResource(R.drawable.card2);
                    } else if (num.hit3_random_num == 3) {
                        hitImg3.setImageResource(R.drawable.card3);
                    } else if (num.hit3_random_num == 4) {
                        hitImg3.setImageResource(R.drawable.card4);
                    } else if (num.hit3_random_num == 5) {
                        hitImg3.setImageResource(R.drawable.card5);
                    } else if (num.hit3_random_num == 6) {
                        hitImg3.setImageResource(R.drawable.card6);
                    } else if (num.hit3_random_num == 7) {
                        hitImg3.setImageResource(R.drawable.card7);
                    } else if (num.hit3_random_num == 8) {
                        hitImg3.setImageResource(R.drawable.card8);
                    } else if (num.hit3_random_num == 9) {
                        hitImg3.setImageResource(R.drawable.card9);
                    } else if (num.hit3_random_num == 10) {
                        hitImg3.setImageResource(R.drawable.card10);
                    } else if (num.hit3_random_num == 11) {
                        hitImg3.setImageResource(R.drawable.card11);
                    } else if (num.hit3_random_num == 12) {
                        hitImg3.setImageResource(R.drawable.card12);
                    } else if (num.hit3_random_num == 13) {
                        hitImg3.setImageResource(R.drawable.card13);
                    }
                    if (num.hit3_random_num >= 10) {
                        num.hit3_display_num = 10;
                    } else {
                        num.hit3_display_num = num.hit3_random_num;
                    }
                    num.sum += num.hit3_display_num;

                    sumLabel.setText("合計 : " + num.sum);

                    if (num.sum >= 22) {
                        sonLabel.setText("Bust");
                    }
                } else if (i == 3) {
                    i = 4;
                    num.hit4_random_num = r.nextInt(13) + 1;
                    if (num.hit4_random_num == 1) {
                        hitImg4.setImageResource(R.drawable.card1);
                    } else if (num.hit4_random_num == 2) {
                        hitImg4.setImageResource(R.drawable.card2);
                    } else if (num.hit4_random_num == 3) {
                        hitImg4.setImageResource(R.drawable.card3);
                    } else if (num.hit4_random_num == 4) {
                        hitImg4.setImageResource(R.drawable.card4);
                    } else if (num.hit4_random_num == 5) {
                        hitImg4.setImageResource(R.drawable.card5);
                    } else if (num.hit4_random_num == 6) {
                        hitImg4.setImageResource(R.drawable.card6);
                    } else if (num.hit4_random_num == 7) {
                        hitImg4.setImageResource(R.drawable.card7);
                    } else if (num.hit4_random_num == 8) {
                        hitImg4.setImageResource(R.drawable.card8);
                    } else if (num.hit4_random_num == 9) {
                        hitImg4.setImageResource(R.drawable.card9);
                    } else if (num.hit4_random_num == 10) {
                        hitImg4.setImageResource(R.drawable.card10);
                    } else if (num.hit4_random_num == 11) {
                        hitImg4.setImageResource(R.drawable.card11);
                    } else if (num.hit4_random_num == 12) {
                        hitImg4.setImageResource(R.drawable.card12);
                    } else if (num.hit4_random_num == 13) {
                        hitImg4.setImageResource(R.drawable.card13);
                    }
                    if (num.hit4_random_num >= 10) {
                        num.hit4_display_num = 10;
                    } else {
                        num.hit4_display_num = num.hit4_random_num;
                    }
                    num.sum += num.hit4_display_num;

                    sumLabel.setText("合計 : " + num.sum);

                    if (num.sum >= 22) {
                        sonLabel.setText("Bust");
                    }
                } else if (i == 4) {
                    i = 0;
                    num.hit5_random_num = r.nextInt(13) + 1;
                    if (num.hit5_random_num == 1) {
                        hitImg5.setImageResource(R.drawable.card1);
                    } else if (num.hit5_random_num == 2) {
                        hitImg5.setImageResource(R.drawable.card2);
                    } else if (num.hit5_random_num == 3) {
                        hitImg5.setImageResource(R.drawable.card3);
                    } else if (num.hit5_random_num == 4) {
                        hitImg5.setImageResource(R.drawable.card4);
                    } else if (num.hit5_random_num == 5) {
                        hitImg5.setImageResource(R.drawable.card5);
                    } else if (num.hit5_random_num == 6) {
                        hitImg5.setImageResource(R.drawable.card6);
                    } else if (num.hit5_random_num == 7) {
                        hitImg5.setImageResource(R.drawable.card7);
                    } else if (num.hit5_random_num == 8) {
                        hitImg5.setImageResource(R.drawable.card8);
                    } else if (num.hit5_random_num == 9) {
                        hitImg5.setImageResource(R.drawable.card9);
                    } else if (num.hit5_random_num == 10) {
                        hitImg5.setImageResource(R.drawable.card10);
                    } else if (num.hit5_random_num == 11) {
                        hitImg5.setImageResource(R.drawable.card11);
                    } else if (num.hit5_random_num == 12) {
                        hitImg5.setImageResource(R.drawable.card12);
                    } else if (num.hit5_random_num == 13) {
                        hitImg5.setImageResource(R.drawable.card13);
                    }
                    if (num.hit5_random_num >= 10) {
                        num.hit5_display_num = 10;
                    } else {
                        num.hit5_display_num = num.hit5_random_num;
                    }
                    num.sum += num.hit5_display_num;

                    sumLabel.setText("合計 : " + num.sum);

                    if (num.sum >= 22) {
                        sonLabel.setText("Bust");
                    }
                }
            }
        });

        standButton.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
            }
        });


        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                startImg1.setImageResource(R.drawable.card0);
                startImg2.setImageResource(R.drawable.card0);
                hitImg1.setImageResource(R.drawable.card0);
                hitImg2.setImageResource(R.drawable.card0);
                hitImg3.setImageResource(R.drawable.card0);
                hitImg4.setImageResource(R.drawable.card0);
                hitImg5.setImageResource(R.drawable.card0);
                num.sum = 0;
                sumLabel.setText("合計 : " + num.sum);
                sonLabel.setText("");
            }
        });
    }
}