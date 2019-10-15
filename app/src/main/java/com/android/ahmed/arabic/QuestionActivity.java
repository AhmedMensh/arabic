package com.android.ahmed.arabic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.android.ahmed.arabic.model.Question;

import java.util.ArrayList;
import java.util.Random;

import imangazaliev.immaplayer.ImmaPlayer;

public class QuestionActivity extends AppCompatActivity {

    Question question1, question2, question3, question4, question5, question6, question7, question8, question9, question10, question11, question12, question13, question14, question15, question16, question17, question18, question19, question20, question21, question22, question23, question24, question25, question26,
            question27, question28, question29, question30, question31, question32, question33, question34, question35, question36, question37, question38, question39, question40, question41, question42, question43, question44, question45, question46;
    LinearLayout questionLayout;
    TextView question_body;
    RadioButton button1;
    RadioButton button2;
    RadioButton button3;
    RadioButton button4;
    RadioGroup radioGroup;
    TextView scoreTv;
    private ImmaPlayer mAudioPlayer;
    //  Button nextBtn;
    Question currentQuestion;
    int questionNumber = 0;
    int score = 0;
    // int selectedButton;
    ArrayList<Question> questions = new ArrayList<>();
    private Toolbar mToolbar;


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("QUESTION_NUMBER", questionNumber);
        outState.putInt("SCORE", score);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        initToolbar();
        if (savedInstanceState != null) {
            // Restore value of members from saved state
            score = savedInstanceState.getInt("SCORE");
            questionNumber = savedInstanceState.getInt("QUESTION_NUMBER");
        }
        mAudioPlayer = new ImmaPlayer(this);

        insertQuestions();


        questionLayout = findViewById(R.id.question_layout);
        question_body = findViewById(R.id.question_tv);
        button1 = findViewById(R.id.answer1);
        button2 = findViewById(R.id.answer2);
        button3 = findViewById(R.id.answer3);
        button4 = findViewById(R.id.answer4);
        //nextBtn=findViewById(R.id.next_btn);

        radioGroup = findViewById(R.id.answers);
        scoreTv = findViewById(R.id.score_tv);

        currentQuestion = questions.get(questionNumber);
        updateRadioGroup(currentQuestion);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
                    case R.id.answer1:
                        if (currentQuestion.getCorrectAnswer().equals(button1.getText())) {
                            score++;
                            mAudioPlayer.setAudioFromAssets("correct_answer_sound.mp3");
                        } else {
                            mAudioPlayer.setAudioFromAssets("wrong_answer_sound.mp3");
                        }
                        if (questionNumber != questions.size()) {

                            questionNumber++;
                            currentQuestion = questions.get(questionNumber);
                            updateRadioGroup(currentQuestion);
                        } else {
                            question_body.setVisibility(View.GONE);
                            radioGroup.setVisibility(View.GONE);
                            scoreTv.setVisibility(View.VISIBLE);
                            scoreTv.setText("your score is " + score + " out of " + questions.size());
                        }
                        mAudioPlayer.play();

                        break;
                    case R.id.answer2:
                        if (currentQuestion.getCorrectAnswer().equals(button2.getText())) {
                            score++;
                            mAudioPlayer.setAudioFromAssets("correct_answer_sound.mp3");
                        } else {
                            mAudioPlayer.setAudioFromAssets("wrong_answer_sound.mp3");
                        }
                        mAudioPlayer.play();
                        if (questionNumber != questions.size()) {

                            questionNumber++;
                            currentQuestion = questions.get(questionNumber);
                            updateRadioGroup(currentQuestion);
                        } else {
                            question_body.setVisibility(View.GONE);
                            radioGroup.setVisibility(View.GONE);
                            scoreTv.setVisibility(View.VISIBLE);
                            scoreTv.setText("your score is " + score + " out of " + questions.size());
                        }


                        break;
                    case R.id.answer3:
                        if (currentQuestion.getCorrectAnswer().equals(button3.getText())) {
                            score++;
                            mAudioPlayer.setAudioFromAssets("correct_answer_sound.mp3");
                        } else {
                            mAudioPlayer.setAudioFromAssets("wrong_answer_sound.mp3");
                        }

                        mAudioPlayer.play();
                        if (questionNumber != questions.size()) {

                            questionNumber++;
                            currentQuestion = questions.get(questionNumber);
                            updateRadioGroup(currentQuestion);
                        } else {
                            question_body.setVisibility(View.GONE);
                            radioGroup.setVisibility(View.GONE);
                            scoreTv.setVisibility(View.VISIBLE);
                            scoreTv.setText("your score is " + score + " out of " + questions.size());
                        }
                        break;
                    case R.id.answer4:
                        if (currentQuestion.getCorrectAnswer().equals(button4.getText())) {
                            mAudioPlayer.setAudioFromAssets("correct_answer_sound.mp3");
                            score++;
                        } else {
                            mAudioPlayer.setAudioFromAssets("wrong_answer_sound.mp3");

                        }

                        if (questionNumber != questions.size()) {

                            questionNumber++;
                            currentQuestion = questions.get(questionNumber);
                            updateRadioGroup(currentQuestion);
                        } else {
                            question_body.setVisibility(View.GONE);
                            radioGroup.setVisibility(View.GONE);
                            scoreTv.setVisibility(View.VISIBLE);
                            scoreTv.setText("your score is " + score + " out of " + questions.size());
                        }
                        mAudioPlayer.play();
                        break;

                }
            }
            //   }
        });

    }

    private void insertQuestions() {

        question1 = new Question("خالد: السلام عليكم خليل: و...... السلام؟", "عليكم", "كيف حالك"
                , "مرحبا", "اهلا وسهلا");

        question2 = new Question("خالد: اسمي خالد، ....اسمك؟", "ما", "متى"
                , "ماذا", "كيف");

        question3 = new Question("خالد: ............خليل: بخير، والحمد لله.", "كيف حالك؟", "كم عمرك؟"
                , "ما اسمك؟", "متى تستيقظ؟");

        question4 = new Question("محمد: من .....أنت؟", "أين", "ما"
                , "متى", "ماذا");

        question5 = new Question(" شريف:أنا .......باكستان.", "من", "الى"
                , " بعض", "فى");

        question6 = new Question("محمد: أنا .......، أنا من تركيا.", "تركي", "باكستانى"
                , "سعودى", "مصرى");


        question7 = new Question("مريم: أنا سورية . أنا من .........", "سوريا", "اليمن"
                , "المفرب", "تركيا");


        question8 = new Question("هذا أخي. ...... مدرس", "هو", "هذه"
                , "هى", "هما");


//        question9=new Question(": أهلاً و........","سهلاً","incorrect1"
//                ,"بكم","incorrect3");


        question10 = new Question(" هذا ...... هو مهندس.", "صديقي", "جارتنا"
                , "مزارع", "أختى");


        question11 = new Question("أحمد: مع السلامة.بدر: ...........", "مع السلامة", "كيف حالك؟"
                , "اهلا", "مرحبا");


        question12 = new Question("هذه ..... هي طيبة", "أختي", "محمد"
                , "اخى", "جارنا");

        question13 = new Question("من هذا؟علي: .......والدي", "هذا", "هم"
                , "هذه", "هولاء");


//        question14=new Question("هذا أخي عيسي وهو .....","طالب","incorrect1"
//                ,"incorrect2","incorrect3");


        question15 = new Question("هل هذه شجرة؟", "شجرة", "دراجه"
                , "سياره", "تليفزيون");

//        question16=new Question(" هذه ......الرسول، صلي الله عليه وسلم.","أسرة","incorrect1"
//                ,"incorrect2","incorrect3");

        question17 = new Question("هذا .....عبد الله", "والده", "والدته"
                , "عمه", "جده");

        question18 = new Question("و....... والدته آمنة", "هذه", "هولاء"
                , "هو", "هذا");

        question19 = new Question("وهذا .......حمزة", "عمه", "خاله"
                , "والده", "جده");

        question20 = new Question("وهذه .....فاطمة", "ابنته", "والده"
                , "والدته", "عمته");

        question21 = new Question("هذا .......الفجر", "أذان", "ساعه"
                , "صوت", "وقت");

        question22 = new Question("سعد في الحمام ......", "يتوضأ", "يأكل"
                , "يقرا", "يذاكر");

        question23 = new Question("سعيد في الغرفة .....القرآن", "يقرأ", "يتوضأ"
                , "يذاكر", "يأكل");

        question24 = new Question("هذا .....المعطف يا والدي", "هو", "هولاء"
                , "هم", "هي");

        question25 = new Question("هذه هي .....، يا والدي", "النظارة", "هولاء"
                , "هم", "هو");


        question26 = new Question("هيا .....إلي المسجد", "بنا", "وسهلا"
                , "نحن", "مرحبا");


        question27 = new Question("أحمد: أين تسكن؟ حسان: .......في حي المطار", "أسكن", "اذاكر"
                , "أذهب", "اعمل");


        question28 = new Question("أسكن في ..... الجامعة", "حي", "مدينه"
                , "شارع", "دوله");


        question29 = new Question("هل تسكن .....بيت؟", "في", "عن"
                , "الى", "من");

//
//        question30=new Question("لدينا ......جميلة","شقة","incorrect1"
//                ,"incorrect2","incorrect3");

        question31 = new Question("كم ......في الشقة؟", "غرفة", "دراجه"
                , "سياره", "طابق");

        question32 = new Question("في ........خمس غرف", "الشقة", "المسجد"
                , "الشركه", "الشارع");


        question33 = new Question("في ......دور الشقة؟", "أي", "عن"
                , "الى", "من");


//        question34=new Question("هذه .....جميلة","شقة","incorrect1"
//                ,"incorrect2","incorrect3");


        question35 = new Question("أريد .......الأثاث", "بعض", "فى"
                , "الى", "من");


        question36 = new Question("ماذا..... لغرفة النوم؟", "تريد", "تنام"
                , "تأكل", "تعيش");

        question37 = new Question("أريد أريكة و......", "سجادة", "باب"
                , "دراجه", "سياره");


//        question38=new Question("أريد فرناً .......","وثلاجة","incorrect1"
//                ,"incorrect2","incorrect3");


        question39 = new Question("طارق: متى ........؟\n" +
                "طاهر: أستيقظ عند الفجر\n", "تستيقظ", "العصر"
                , "الظهر", "العشاء");


        question40 = new Question("\n" +
                "طارق: أين....... الفجر؟\n" +
                "طاهر: أصلي الفجر في المسجد.\n", "تصلي", "تأكل"
                , "تذاكر", "تنام");


//        question41=new Question("هذا .......الفجر","أذان","incorrect1"
//                ,"incorrect2","incorrect3");

        question42 = new Question("ومتى....... إلي المدرسة؟", "تذهب", "تخرج"
                , "تشرب", "تعمل");

        question43 = new Question("هذا .....العطلة", "يوم", "اسبوع"
                , "سنه", "شهر");

        question44 = new Question("الأم: ماذا .......يا طارق؟\n" +
                "طارق: سأكنس غرفة الجلوس.\n" +
                "\n", "ستفعل", "تريد"
                , "ستذاكر", "ستأكل");

        question45 = new Question("الأم: وماذا ستفعلين يا فاطمة؟\n" +
                "فاطمة: .........النوم.", "سأكنس غرفة", "سأذهب"
                , "سافعل", "سأكل");

        question46 = new Question("الأم: وماذا ستفعلين يا لطيفة؟\n" +
                "لطيفة: سأكوي......", "الملابس", "الستائر"
                , "المفروشات", "السجاد");


        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);
        questions.add(question6);
        questions.add(question7);
        questions.add(question8);
//        questions.add(question9);
        questions.add(question10);
//        questions.add(question11);
//        questions.add(question12);
//        questions.add(question13);
////        questions.add(question14);
//        questions.add(question15);
////        questions.add(question16);
//        questions.add(question17);
//        questions.add(question18);
//        questions.add(question19);
//        questions.add(question20);
//        questions.add(question21);
//        questions.add(question22);
//        questions.add(question23);
//        questions.add(question24);
//        questions.add(question25);
//        questions.add(question26);
//        questions.add(question27);
//        questions.add(question28);
//        questions.add(question29);
////        questions.add(question30);
//        questions.add(question31);
//        questions.add(question32);
//        questions.add(question33);
////        questions.add(question34);
//        questions.add(question35);
//        questions.add(question36);
//        questions.add(question37);
////        questions.add(question38);
//        questions.add(question39);
//        questions.add(question40);
////        questions.add(question41);
//        questions.add(question42);
//        questions.add(question43);
//        questions.add(question44);
//        questions.add(question45);
//        questions.add(question46);

    }

    private void nextQuestion() {
        if (radioGroup.getCheckedRadioButtonId() == -1)
            Toast.makeText(this, "Please select answer", Toast.LENGTH_SHORT).show();
        else {
            if (questionNumber != questions.size()) {

                mAudioPlayer.stop();
                radioGroup.clearCheck();
                button1.setChecked(false);
                button2.setChecked(false);
                button3.setChecked(false);
                button4.setChecked(false);
                questionNumber++;
                currentQuestion = questions.get(questionNumber);
                updateRadioGroup(currentQuestion);
            } else {
                question_body.setVisibility(View.GONE);
                radioGroup.setVisibility(View.GONE);
                scoreTv.setVisibility(View.VISIBLE);
                scoreTv.setText("your score is " + score + " out of " + questions.size());
            }
        }

    }

    private void initToolbar() {


        mToolbar = findViewById(R.id.main_page_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mToolbar.setTitle(R.string.test);
    }



    public void updateRadioGroup(Question question) {


        button1.setChecked(false);
        button2.setChecked(false);
        button3.setChecked(false);
        button4.setChecked(false);
        Random random = new Random();
        int correctAnswerLocation = random.nextInt(4);
        question_body.setText(question.getBody());

        if (button1.getTag().equals(Integer.toString(correctAnswerLocation))) {

            button1.setText(question.getCorrectAnswer());
            button2.setText(question.getIncorrectAnswer1());
            button3.setText(question.getIncorrectAnswer2());
            button4.setText(question.getIncorrectAnswer3());
        } else if (button2.getTag().equals(Integer.toString(correctAnswerLocation))) {
            button2.setText(question.getCorrectAnswer());
            button4.setText(question.getIncorrectAnswer1());
            button1.setText(question.getIncorrectAnswer2());
            button3.setText(question.getIncorrectAnswer3());
        } else if (button3.getTag().equals(Integer.toString(correctAnswerLocation))) {
            button3.setText(question.getCorrectAnswer());
            button4.setText(question.getIncorrectAnswer1());
            button2.setText(question.getIncorrectAnswer2());
            button1.setText(question.getIncorrectAnswer3());

        } else if (button4.getTag().equals(Integer.toString(correctAnswerLocation))) {
            button4.setText(question.getCorrectAnswer());
            button2.setText(question.getIncorrectAnswer1());
            button1.setText(question.getIncorrectAnswer2());
            button3.setText(question.getIncorrectAnswer3());
        }


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                onBackPressed();
                break;

        }
        return super.onOptionsItemSelected(item);

    }
}
