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
        public static int a = 0;
        public static int aa = 0;
        public static int b = 0;
        public static int bb = 0;
    }

    public void imageDisplayInitialize() {

        //Text
        final TextView sumLabel = findViewById(R.id.textView);
        sumLabel.setText("合計 : 0");

        //Button
        final Button start = (Button) findViewById(R.id.start);
        final Button hit = (Button) findViewById(R.id.hit);
        final Button stand = (Button) findViewById(R.id.stand);
        final Button reset= (Button) findViewById(R.id.reset);

        //Image
        final ImageView img1 = findViewById(R.id.imageView1);
        img1.setImageResource(R.drawable.a);
        final ImageView img2 = findViewById(R.id.imageView2);
        img2.setImageResource(R.drawable.a);
        final ImageView img3 = findViewById(R.id.imageView3);
        img3.setImageResource(R.drawable.a);
        final ImageView img4 = findViewById(R.id.imageView4);
        img4.setImageResource(R.drawable.a);
        final ImageView img5 = findViewById(R.id.imageView5);
        img5.setImageResource(R.drawable.a);
        final ImageView img6 = findViewById(R.id.imageView6);
        img6.setImageResource(R.drawable.a);
        final ImageView img7 = findViewById(R.id.imageView7);
        img7.setImageResource(R.drawable.a);


        final Random r = new Random();

        start.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                num.a = r.nextInt(13) + 1;
                if (num.a == 1) {
                    img1.setImageResource(R.drawable.b);
                } else if (num.a == 2) {
                    img1.setImageResource(R.drawable.c);
                } else if (num.a == 3) {
                    img1.setImageResource(R.drawable.d);
                } else if (num.a == 4) {
                    img1.setImageResource(R.drawable.e);
                } else if (num.a == 5) {
                    img1.setImageResource(R.drawable.f);
                } else if (num.a == 6) {
                    img1.setImageResource(R.drawable.g);
                } else if (num.a == 7) {
                    img1.setImageResource(R.drawable.h);
                } else if (num.a == 8) {
                    img1.setImageResource(R.drawable.i);
                } else if (num.a == 9) {
                    img1.setImageResource(R.drawable.j);
                } else if (num.a == 10) {
                    img1.setImageResource(R.drawable.k);
                } else if (num.a == 11) {
                    img1.setImageResource(R.drawable.l);
                } else if (num.a == 12) {
                    img1.setImageResource(R.drawable.m);
                } else if (num.a == 13) {
                    img1.setImageResource(R.drawable.n);
                }
                if (num.a >= 10) {
                    num.aa = 10;
                } else {
                    num.aa = num.a;
                }
                num.b = r.nextInt(13) + 1;
                if (num.b == 1) {
                    img2.setImageResource(R.drawable.b);
                } else if (num.b == 2) {
                    img2.setImageResource(R.drawable.c);
                } else if (num.b == 3) {
                    img2.setImageResource(R.drawable.d);
                } else if (num.b == 4) {
                    img2.setImageResource(R.drawable.e);
                } else if (num.b == 5) {
                    img2.setImageResource(R.drawable.f);
                } else if (num.b== 6) {
                    img2.setImageResource(R.drawable.g);
                } else if (num.b == 7) {
                    img2.setImageResource(R.drawable.h);
                } else if (num.b == 8) {
                    img2.setImageResource(R.drawable.i);
                } else if (num.b == 9) {
                    img2.setImageResource(R.drawable.j);
                } else if (num.b == 10) {
                    img2.setImageResource(R.drawable.k);
                } else if (num.b == 11) {
                    img2.setImageResource(R.drawable.l);
                } else if (num.b == 12) {
                    img2.setImageResource(R.drawable.m);
                } else if (num.b == 13) {
                    img2.setImageResource(R.drawable.n);
                }
                if (num.b >= 10) {
                    num.bb = 10;
                } else {
                    num.bb = num.b;
                }
                num.sum = num.aa + num.bb;
            }
        });

        sumLabel.setText("合計 : " + num.sum);

        hit.setOnClickListener(new View.OnClickListener() {
            int i = 0;
            @Override public void onClick(View view) {
                if (i == 0) {
                    i = 1;
                    int x = (int) (Math.random() * 13) + 1;
                    if (x == 1) {
                        img3.setImageResource(R.drawable.b);
                    } else if (x == 2) {
                        img3.setImageResource(R.drawable.c);
                    } else if (x == 3) {
                        img3.setImageResource(R.drawable.d);
                    } else if (x == 4) {
                        img3.setImageResource(R.drawable.e);
                    } else if (x == 5) {
                        img3.setImageResource(R.drawable.f);
                    } else if (x == 6) {
                        img3.setImageResource(R.drawable.g);
                    } else if (x == 7) {
                        img3.setImageResource(R.drawable.h);
                    } else if (x == 8) {
                        img3.setImageResource(R.drawable.i);
                    } else if (x == 9) {
                        img3.setImageResource(R.drawable.j);
                    } else if (x == 10) {
                        img3.setImageResource(R.drawable.k);
                    } else if (x == 11) {
                        img3.setImageResource(R.drawable.l);
                    } else if (x == 12) {
                        img3.setImageResource(R.drawable.m);
                    } else if (x == 13) {
                        img3.setImageResource(R.drawable.n);
                    }
                } else if (i == 1){
                    i = 2;
                    int x = (int) (Math.random() * 13) + 1;
                    if (x == 0) {
                        img4.setImageResource(R.drawable.b);
                    } else if (x == 2) {
                        img4.setImageResource(R.drawable.c);
                    } else if (x == 3) {
                        img4.setImageResource(R.drawable.d);
                    } else if (x == 4) {
                        img4.setImageResource(R.drawable.e);
                    } else if (x == 5) {
                        img4.setImageResource(R.drawable.f);
                    } else if (x == 6) {
                        img4.setImageResource(R.drawable.g);
                    } else if (x == 7) {
                        img4.setImageResource(R.drawable.h);
                    } else if (x == 8) {
                        img4.setImageResource(R.drawable.i);
                    } else if (x == 9) {
                        img4.setImageResource(R.drawable.j);
                    } else if (x == 10) {
                        img4.setImageResource(R.drawable.k);
                    } else if (x == 11) {
                        img4.setImageResource(R.drawable.l);
                    } else if (x == 12) {
                        img4.setImageResource(R.drawable.m);
                    } else if (x == 13) {
                        img4.setImageResource(R.drawable.n);
                    }
                } else if (i == 2) {
                    i = 3;
                    int x = (int) (Math.random() * 13) + 1;
                    if (x == 0) {
                        img5.setImageResource(R.drawable.b);
                    } else if (x == 2) {
                        img5.setImageResource(R.drawable.c);
                    } else if (x == 3) {
                        img5.setImageResource(R.drawable.d);
                    } else if (x == 4) {
                        img5.setImageResource(R.drawable.e);
                    } else if (x == 5) {
                        img5.setImageResource(R.drawable.f);
                    } else if (x == 6) {
                        img5.setImageResource(R.drawable.g);
                    } else if (x == 7) {
                        img5.setImageResource(R.drawable.h);
                    } else if (x == 8) {
                        img5.setImageResource(R.drawable.i);
                    } else if (x == 9) {
                        img5.setImageResource(R.drawable.j);
                    } else if (x == 10) {
                        img5.setImageResource(R.drawable.k);
                    } else if (x == 11) {
                        img5.setImageResource(R.drawable.l);
                    } else if (x == 12) {
                        img5.setImageResource(R.drawable.m);
                    } else if (x == 13) {
                        img5.setImageResource(R.drawable.n);
                    }
                } else if (i == 3) {
                    i = 4;
                    int x = (int) (Math.random() * 13) + 1;
                    if (x == 0) {
                        img6.setImageResource(R.drawable.b);
                    } else if (x == 2) {
                        img6.setImageResource(R.drawable.c);
                    } else if (x == 3) {
                        img6.setImageResource(R.drawable.d);
                    } else if (x == 4) {
                        img6.setImageResource(R.drawable.e);
                    } else if (x == 5) {
                        img6.setImageResource(R.drawable.f);
                    } else if (x == 6) {
                        img6.setImageResource(R.drawable.g);
                    } else if (x == 7) {
                        img6.setImageResource(R.drawable.h);
                    } else if (x == 8) {
                        img6.setImageResource(R.drawable.i);
                    } else if (x == 9) {
                        img6.setImageResource(R.drawable.j);
                    } else if (x == 10) {
                        img6.setImageResource(R.drawable.k);
                    } else if (x == 11) {
                        img6.setImageResource(R.drawable.l);
                    } else if (x == 12) {
                        img6.setImageResource(R.drawable.m);
                    } else if (x == 13) {
                        img6.setImageResource(R.drawable.n);
                    }
                } else if (i == 4) {
                    i = 0;
                    int x = (int) (Math.random() * 13) + 1;
                    if (x == 0) {
                        img7.setImageResource(R.drawable.b);
                    } else if (x == 2) {
                        img7.setImageResource(R.drawable.c);
                    } else if (x == 3) {
                        img7.setImageResource(R.drawable.d);
                    } else if (x == 4) {
                        img7.setImageResource(R.drawable.e);
                    } else if (x == 5) {
                        img7.setImageResource(R.drawable.f);
                    } else if (x == 6) {
                        img7.setImageResource(R.drawable.g);
                    } else if (x == 7) {
                        img7.setImageResource(R.drawable.h);
                    } else if (x == 8) {
                        img7.setImageResource(R.drawable.i);
                    } else if (x == 9) {
                        img7.setImageResource(R.drawable.j);
                    } else if (x == 10) {
                        img7.setImageResource(R.drawable.k);
                    } else if (x == 11) {
                        img7.setImageResource(R.drawable.l);
                    } else if (x == 12) {
                        img7.setImageResource(R.drawable.m);
                    } else if (x == 13) {
                        img7.setImageResource(R.drawable.n);
                    }
                }
            }
        });

        stand.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
            }
        });


        reset.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                img1.setImageResource(R.drawable.a);
                img2.setImageResource(R.drawable.a);
                img3.setImageResource(R.drawable.a);
                img4.setImageResource(R.drawable.a);
                img5.setImageResource(R.drawable.a);
                img6.setImageResource(R.drawable.a);
                img7.setImageResource(R.drawable.a);
                num.sum = 0;
            }
        });
    }
}