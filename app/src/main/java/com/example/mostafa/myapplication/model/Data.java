package com.example.mostafa.myapplication.model;

import android.util.Log;

import java.util.ArrayList;

public class Data {

    String lessonNumber;
    String storyNumber;
    String audioName;
    //unit 1
    ArrayList<LessonDetails> body_1_1 =new ArrayList<>();
    ArrayList<LessonDetails> body_1_2 =new ArrayList<>();
    ArrayList<LessonDetails> body_1_3 =new ArrayList<>();
    ArrayList<LessonDetails> body_1_4 =new ArrayList<>();
    ArrayList<LessonDetails> body_1_5 =new ArrayList<>();
    ArrayList<LessonDetails> body_1_6 =new ArrayList<>();
    //unit 2
    ArrayList<LessonDetails> body_2_1 =new ArrayList<>();
    ArrayList<LessonDetails> body_2_2 =new ArrayList<>();
    ArrayList<LessonDetails> body_2_3 =new ArrayList<>();
    //unit 3
    ArrayList<LessonDetails> body_3_1 =new ArrayList<>();
    ArrayList<LessonDetails> body_3_2 =new ArrayList<>();
    ArrayList<LessonDetails> body_3_3 =new ArrayList<>();
    //unit 4
    ArrayList<LessonDetails> body_4_1 =new ArrayList<>();
    ArrayList<LessonDetails> body_4_2 =new ArrayList<>();
    ArrayList<LessonDetails> body_4_3 =new ArrayList<>();
    //unit 5
    ArrayList<LessonDetails> body_5_1 =new ArrayList<>();
    ArrayList<LessonDetails> body_5_2 =new ArrayList<>();
    ArrayList<LessonDetails> body_5_3 =new ArrayList<>();
    //unit 6
    ArrayList<LessonDetails> body_6_1 =new ArrayList<>();
    ArrayList<LessonDetails> body_6_2 =new ArrayList<>();
    ArrayList<LessonDetails> body_6_3 =new ArrayList<>();
    //unit 7
    ArrayList<LessonDetails> body_7_1 =new ArrayList<>();
    ArrayList<LessonDetails> body_7_2 =new ArrayList<>();
    ArrayList<LessonDetails> body_7_3 =new ArrayList<>();
    //unit 8
    ArrayList<LessonDetails> body_8_1 =new ArrayList<>();
    ArrayList<LessonDetails> body_8_2 =new ArrayList<>();
    ArrayList<LessonDetails> body_8_3 =new ArrayList<>();
    //unit 9
    ArrayList<LessonDetails> body_9_1 =new ArrayList<>();
    ArrayList<LessonDetails> body_9_2 =new ArrayList<>();
    ArrayList<LessonDetails> body_9_3 =new ArrayList<>();
    //unit 10
    ArrayList<LessonDetails> body_10_1 =new ArrayList<>();
    ArrayList<LessonDetails> body_10_2 =new ArrayList<>();
    ArrayList<LessonDetails> body_10_3 =new ArrayList<>();
    //unit 11
    ArrayList<LessonDetails> body_11_1 =new ArrayList<>();
    ArrayList<LessonDetails> body_11_2 =new ArrayList<>();
    ArrayList<LessonDetails> body_11_3 =new ArrayList<>();
    //unit 12
    ArrayList<LessonDetails> body_12_1 =new ArrayList<>();
    ArrayList<LessonDetails> body_12_2 =new ArrayList<>();
    ArrayList<LessonDetails> body_12_3 =new ArrayList<>();
    //unit 13
    ArrayList<LessonDetails> body_13_1 =new ArrayList<>();
    ArrayList<LessonDetails> body_13_2 =new ArrayList<>();
    ArrayList<LessonDetails> body_13_3 =new ArrayList<>();
    //unit 14
    ArrayList<LessonDetails> body_14_1 =new ArrayList<>();
    ArrayList<LessonDetails> body_14_2 =new ArrayList<>();
    ArrayList<LessonDetails> body_14_3 =new ArrayList<>();
    //unit 15
    ArrayList<LessonDetails> body_15_1 =new ArrayList<>();
    ArrayList<LessonDetails> body_15_2 =new ArrayList<>();
    ArrayList<LessonDetails> body_15_3 =new ArrayList<>();
    //unit 16
    ArrayList<LessonDetails> body_16_1 =new ArrayList<>();
    ArrayList<LessonDetails> body_16_2 =new ArrayList<>();
    ArrayList<LessonDetails> body_16_3 =new ArrayList<>();
    //creat sub stories lists
    ArrayList<SubStory> subStories1 = new ArrayList<>();
    ArrayList<SubStory> subStories2 = new ArrayList<>();
    ArrayList<SubStory> subStories3 = new ArrayList<>();
    ArrayList<SubStory> subStories4 = new ArrayList<>();
    ArrayList<SubStory> subStories5 = new ArrayList<>();
    ArrayList<SubStory> subStories6 = new ArrayList<>();
    ArrayList<SubStory> subStories7 = new ArrayList<>();
    ArrayList<SubStory> subStories8 = new ArrayList<>();
    ArrayList<SubStory> subStories9 = new ArrayList<>();
    ArrayList<SubStory> subStories10 = new ArrayList<>();
    ArrayList<SubStory> subStories11 = new ArrayList<>();
    ArrayList<SubStory> subStories12 = new ArrayList<>();
    ArrayList<SubStory> subStories13 = new ArrayList<>();
    ArrayList<SubStory> subStories14 = new ArrayList<>();
    ArrayList<SubStory> subStories15 = new ArrayList<>();
    ArrayList<SubStory> subStories16 = new ArrayList<>();








    public Data() {
        //lesson 1.1
        body_1_1.add(new LessonDetails("خالد: السلام عليكم","Khaled: Peace be with you",0));
        body_1_1.add(new LessonDetails("خليل: وعليكم السلام","Khalil: May peace be upon you",2000));
        body_1_1.add(new LessonDetails("خالد: اسمى خالد ما اسمك؟","Khaled: My name is Khaled What is your name?",6000));
        body_1_1.add(new LessonDetails("خليل: اسمى خليل","Khalil: My name is Khalil",10000));
        body_1_1.add(new LessonDetails("خالد: كيف حالك؟","Khalid: How are you?",12000));
        body_1_1.add(new LessonDetails("خليل: بخير والحمدلله وكيف حالك انت؟","Khalil: Fine and thankfully and how are you?",15000));
        body_1_1.add(new LessonDetails("خالد: بخير والحمدلله","Khalid: Fine and thankfully",20000));
        //lesson 1.2
        body_1_2.add(new LessonDetails("خولة: السلام عليكم","Khawla: Peace be with you",0));
        body_1_2.add(new LessonDetails("خديجة: وعليكم السلام","Khadija: May peace be upon you",2000));
        body_1_2.add(new LessonDetails("خولة: اسمى خولة ما اسمك؟","Khawla: My name is Khawla What is your name?",5500));
        body_1_2.add(new LessonDetails("خديجة: اسمى خديجة","Khadija: My name is Khadija",8000));
        body_1_2.add(new LessonDetails("خولة: كيف حالك؟","Khawla: How are you?",10000));
        body_1_2.add(new LessonDetails("خديجة: بخير والحمدلله وكيف حالك انت؟","Khadija: Fine and thankfully and how are you?",12000));
        body_1_2.add(new LessonDetails("خولة: بخير والحمدلله","Khawla: Fine and thankfully",17000));
        //lesson 1.3
        body_1_3.add(new LessonDetails("محمد: السلام عليكم","Mohammed: Peace be upon you",0));
        body_1_3.add(new LessonDetails("شريف: وعليكم السلام","Sharif: Peace be upon you",2000));
        body_1_3.add(new LessonDetails("محمد: من أين أنت؟","Mohammed: Where are you from?",4000));
        body_1_3.add(new LessonDetails("شريف: أنا من باكستان .","Sharif: I am from Pakistan.",6000));
        body_1_3.add(new LessonDetails("محمد: هل أنت باكستاني؟","Mohammed: Are you Pakistani?",10000));
        body_1_3.add(new LessonDetails("شريف: نعم، أنا باكستاني، وما جنسيتك أنت؟ " ,"Sharif: Yes, I am a Pakistani,\n" +
                "          What is your nationality?",12000));
        body_1_3.add(new LessonDetails("محمد: أنا تركي، أنا من تركيا.","Mohammed: I'm Turkish, I'm from Turkey.",18000));
        body_1_3.add(new LessonDetails("شريف: أهلاً وسهلاً.","Sherif: Welcome.",22000));
        //lesson 1.4

        body_1_4.add(new LessonDetails("مريم: السلام عليكم.","Maryam: Peace be upon you.",0));
        body_1_4.add(new LessonDetails("زينب: وعليكم السلام.","Zainab: Peace be upon you.",2000));
        body_1_4.add(new LessonDetails("مريم: من أين أنت؟","Maryam: Where are you from?",4000));
        body_1_4.add(new LessonDetails("زينب: أنا من مصر","Zainab: I am from Egypt",6000));
        body_1_4.add(new LessonDetails("مريم: هل أنت مصرية؟.","Maryam: Are you Egyptian?",8000));
        body_1_4.add(new LessonDetails("زينب: نعم، أنا مصرية. وما جنسيتك أنت؟","Zainab: Yes, I am Egyptian.What is your nationality?",10000));
        body_1_4.add(new LessonDetails("مريم: أنا سورية . أنا من سوريا.","Maryam: I'm Syrian. I am from Syria",15000));
        body_1_4.add(new LessonDetails("زينب: أهلاً وسهلاً.","Zainab: Welcome.",18000));
        //lesson 1.5
        body_1_5.add(new LessonDetails("أحمد: السلام عليكم.","Ahmed: Peace be upon you.",0));
        body_1_5.add(new LessonDetails("بدر: وعليكم السلام.","Badr: Peace be upon you.",2500));
        body_1_5.add(new LessonDetails("أحمد: هذا أخي. هو مدرس.","Ahmed: This is my brother. He is a teacher.",5000));
        body_1_5.add(new LessonDetails("بدر: أهلاً وسهلاً.","Badr: Welcome",8000));
        body_1_5.add(new LessonDetails("أحمد: هذا صديقي. هو مهندس.","Ahmed: This is my friend. he is an engineer.",10000));
        body_1_5.add(new LessonDetails("الأخ: أهلاً وسهلاً.","Brother: Welcome.",14000));
        body_1_5.add(new LessonDetails("أحمد: مع السلامة.","Ahmed: With safety.",16000));
        body_1_5.add(new LessonDetails("بدر: مع السلامة.","Badr: With safety.",18000));
        //lesson 1.6
        body_1_6.add(new LessonDetails("ندي: السلام عليكم.","Ndi: Peace be upon you.",0));
        body_1_6.add(new LessonDetails("هدي: وعليكم السلام.","Huda: Peace be upon you.",2000));
        body_1_6.add(new LessonDetails("ندي: هذه أختي. هي طبيبة.","Ndi: This is my sister. She is a doctor.",4000));
        body_1_6.add(new LessonDetails("هدي: أهلاً وسهلاً.","Huda: Welcome",8000));
        body_1_6.add(new LessonDetails("ندي: هذه صديقتي. هي طالبة.","Ndi: This is my girlfriend. She is a student.",11000));
        body_1_6.add(new LessonDetails("الأخت: أهلاً وسهلاً.","Sister: Welcome",14000));
        body_1_6.add(new LessonDetails("ندي: مع السلامة.","Ndi: With safety.",17000));
        body_1_6.add(new LessonDetails("هدي: مع السلامة.","Huda: With safety.",19000));
        //lesson 2.1
        body_2_1.add(new LessonDetails("علي: السلام عليكم.","Ali: Peace be upon you.",0));
        body_2_1.add(new LessonDetails("عمار: وعليكم السلام.","Ammar: Peace be upon you.",2000));
        body_2_1.add(new LessonDetails("علي: هذه صورة أسرتي.","Ali: This is the picture of my family.",4000));
        body_2_1.add(new LessonDetails("عمار: ما شاء الله!من هذا؟","Ammar:mashallah!hwo is this?",7000));
        body_2_1.add(new LessonDetails("علي: هذا والدي عدنان وهو مهندس.","Ali: This is my father Adnan, an engineer.",9000));
        body_2_1.add(new LessonDetails("عمار: ومن هذه ؟","Ammar: Who is she?",13000));
        body_2_1.add(new LessonDetails("علي: هذه والدتي سعيدة وهي طبيبة.","Ali: This is my mother Saida, she is a doctor.",15000));
        body_2_1.add(new LessonDetails("عمار: ومن هذا؟","Ammar: Who is this?",19000));
        body_2_1.add(new LessonDetails("علي: هذا أخي عيسي وهو طالب.","Ali: This is my brother Issa, a student.",21000));
        body_2_1.add(new LessonDetails("عمار: ومن هذه؟","Ammar: Who is she?",24000));
        body_2_1.add(new LessonDetails("علي: هذه أختي عبلة وهي معلمة. وهذا جدي. وهذه جدتي.","Ali: This is my sister Abla, a teacher. This is my grandfather. This is my grandmother.",26000));
        body_2_1.add(new LessonDetails("عمار: ما شاء الله!","Ammar:mashallah!",33000));
        //lesson 2.2
        body_2_2.add(new LessonDetails("عمر: هل هذه شجرة؟","Omar:Is that a tree?",0));
        body_2_2.add(new LessonDetails("عثمان: نعم، هذه أسرة الرسول","Osman:Yes, this is the messenger's family",3000));
        body_2_2.add(new LessonDetails("عمر: صلي الله عليه وسلم.","Omar:peace be upon him",6000));
        body_2_2.add(new LessonDetails("عمر: هذا والدة عبدالله.","Omar:this is his father Abdulaha",9000));
        body_2_2.add(new LessonDetails("عمر: وهذه والدته آمنة.","Omar: this is his mother, Amenah.",12000));
        body_2_2.add(new LessonDetails("عثمان: وهذا جده عبد المطلب.","Osman: this grandfather Abd al-Muttalib.",15000));
        body_2_2.add(new LessonDetails("عمر: وهذا عمه العباس.","Omar: this his Uncle Abbas",18000));
        body_2_2.add(new LessonDetails("عثمان: وهذا عمه حمزة.","Osman: this his Uncle Hamza.",21000));
        body_2_2.add(new LessonDetails("عثمان: وهذه عمته صفية.","Osman: this aunt Safiya",24000));
        body_2_2.add(new LessonDetails("عمر: وهذا ابنه القاسم.","Omar: this his son  Al-Qasim.",27000));
        body_2_2.add(new LessonDetails("عثمان: وهذا ابنه عبد الله.","Osman: and this is his son Abd Allah.",30000));
        body_2_2.add(new LessonDetails("عمر: وهذا ابنه إبراهيم.","Omar: this his son Ibrahim",33000));
        body_2_2.add(new LessonDetails("عثمان: وهذه ابنته فاطمة.","Osman: and this his daughter Fatima",36000));
        body_2_2.add(new LessonDetails("عمر: وهذه ابنته رقية.","Omar: and this his daughter Rukia",40000));
        body_2_2.add(new LessonDetails("عثمان: وهذه ابنته زينب.","Osman: and this his daughter Zainab",43000));
        body_2_2.add(new LessonDetails("عمر: وهذه ابنته أم كلثوم.","Omar: and this his daughter Oum kalthoom",46000));
        //lesson 2.3
        body_2_3.add(new LessonDetails("الأم: هذا أذان الفجر.","Mother: this Fajr.",0));
        body_2_3.add(new LessonDetails("الأب: الله أكبر. الله أكبر. أين الأولاد؟","Father: Allah Akbar. Allah is greater. Where are the boys?",3000));
        body_2_3.add(new LessonDetails("الأم: سعد في الحمام يتوضأ.","Mother: Saad in the bathroom ablution",9000));
        body_2_3.add(new LessonDetails("الأب: وأين سعيد؟","Father: and where is Said?",12000));
        body_2_3.add(new LessonDetails("الأم: سعيد في الغرفة يقرأ القرآن.","Mother: Said in the room read the Quran.",14000));
        body_2_3.add(new LessonDetails("الأب: وأين سعيدة؟","Father: and where is Saida?",17000));
        body_2_3.add(new LessonDetails("الأم: سعيدة في المصلي تصلي.","Mother: Saida in the Chapel to pray.",19000));
        body_2_3.add(new LessonDetails("الأب: أين المعطف يا سعد؟.","Father: where the coat Saad?",22000));
        body_2_3.add(new LessonDetails("سعد: هذا هو المعطف يا والدي.","Saad: this is the coat, dad.",25000));
        body_2_3.add(new LessonDetails("الأب: وأين النظارة؟","Father: and where are the glasses?",28000));
        body_2_3.add(new LessonDetails("سعيد: هذه هي النظارة، يا والدي.","Said: these are the glasses, Dad",31000));
        body_2_3.add(new LessonDetails("الأب: هيا بنا إلي المسجد.","Father: lets go to mosque.",34000));
        body_2_3.add(new LessonDetails("سعد وسعيد: هيا بنا.","Saad and Said lets go ",37000));
        //lesson 3.1
        body_3_1.add(new LessonDetails("أحمد: السلام عليكم.","Ahmed: Peace be upon you.",000));
        body_3_1.add(new LessonDetails("حسان: وعليكم السلام.","Hassan: Peace be upon you.",2000));
        body_3_1.add(new LessonDetails("أحمد: أين تسكن؟","Ahmed: where do you live?",4000));
        body_3_1.add(new LessonDetails("حسان: أسكن في حي المطار.وأين تسكن أنت؟","Hassan: I live in Leeds, where you live?",6000));
        body_3_1.add(new LessonDetails("أحمد: أسكن في حي الجامعة.","Ahmed: I live in University District",11000));
        body_3_1.add(new LessonDetails("حسان: هل تسكن في بيت؟","Hassan: do you live in a House?",14000));
        body_3_1.add(new LessonDetails("أحمد: نعم، أسكن في بيت.  هل تسكن في بيت؟","Ahmed: Yes, I live in a House. Do you live in a House?",17000));
        body_3_1.add(new LessonDetails("حسان: لا، أسكن في شقة.","Hasan: no, I live in an apartment.",22000));
        body_3_1.add(new LessonDetails("أحمد: ما رقم شقتك ؟","Ahmed: what's your apartment number?",25000));
        body_3_1.add(new LessonDetails("حسان: 5، وما رقم بيتك ؟","Hassan: 5, what's your number?",28000));
        body_3_1.add(new LessonDetails("أحمد: 9.","Ahmed: 9",30000));
        //lesson 3.2
        body_3_2.add(new LessonDetails("المستأجر: السلام عليكم.","The renter: Peace be upon you.",0));
        body_3_2.add(new LessonDetails("المؤجر: وعليكم السلام.","The lessor :Peace be upon you.",2000));
        body_3_2.add(new LessonDetails("المستأجر: أريد شقة من فضلك.","The renter: I want an apartment, please.",4000));
        body_3_2.add(new LessonDetails("المؤجر: لدينا شقة جميلة.","The lessor: We have a beautiful apartment.",7000));
        body_3_2.add(new LessonDetails("المستأجر: كم غرفة في الشقة؟","The renter: How many rooms in the apartment?",10000));
        body_3_2.add(new LessonDetails("المؤجر: في الشقة خمس غرف.","The lessor:5 rooms in the apartment",13500));
        body_3_2.add(new LessonDetails("المستأجر: في أي دور الشقة؟","The renter: At any floor",16000));
        body_3_2.add(new LessonDetails("المؤجر: الشقة في الدور الخامس.","The lessor:Apartment on the fifth floor.",19000));
        body_3_2.add(new LessonDetails("المستأجر: أريد مشاهدة الشقة؟","The renter: I want to see the apartment?",23000));
        body_3_2.add(new LessonDetails("المؤجر: تفضل، هذا باب الشقة.","The lessor: Come on in, this is the door of the apartment.",26000));
        body_3_2.add(new LessonDetails("المستأجر: هذه شقة جميلة.","The renter:This beautiful apartment",30000));
        //lesson 3.3
        body_3_3.add(new LessonDetails("المشتري: السلام عليكم.","Buyer:Peace be upon you.",0));
        body_3_3.add(new LessonDetails("البائع: وعليكم السلام. أي خدمة.","Seller:Peace be upon you.",2000));
        body_3_3.add(new LessonDetails("المشتري: أريد بعض الأثاث.","Buyer: want some furniture.",6000));
        body_3_3.add(new LessonDetails("البائع: ماذا تريد لغرفة النوم؟","Seller: what do you want for the bedroom?",8500));
        body_3_3.add(new LessonDetails("المشتري: أريد سريراً وستارة.","Buyer: I want a bed and a shower curtain.",11500));
        body_3_3.add(new LessonDetails("البائع: وماذا تريد لغرفة الجلوس؟","Seller: and what do you want for the living room?",14500));
        body_3_3.add(new LessonDetails("المشتري: أريد أريكة وسجادة.","Buyer: I want a sofa and carpet.",17500));
        body_3_3.add(new LessonDetails("البائع: وماذا تريد للمطبخ؟","Seller: and what do you want for the kitchen?",20500));
        body_3_3.add(new LessonDetails("المشتري: أريد فرناً وثلاجة.","Buyer: I need a stove and refrigerator.",22500));
        body_3_3.add(new LessonDetails("البائع: وماذا تريد للحمام؟","Seller: and what do you want for your bathroom?",26500));
        body_3_3.add(new LessonDetails("المشتري: أريد سخاناً ومرآة. أريد مشاهدة الأثاث","Buyer: I want that Heater and Mirror.I want to see the furniture",29000));
        body_3_3.add(new LessonDetails("البائع: تفضل.","Seller: Come on",34000));
        //lesson 4.1
        body_4_1.add(new LessonDetails("طارق: متى تستيقظ؟","Tarek: When did you wake up?",000));
        body_4_1.add(new LessonDetails("طاهر: أستيقظ عند الفجر.","Taher: wake up at dawn.",2000));
        body_4_1.add(new LessonDetails("طارق: أين تصلي الفجر؟","Tarek:Where do you pray Fajr?",5000));
        body_4_1.add(new LessonDetails("طاهر: أصلي الفجر في المسجد.","Taher: Pray Fajr in the mosque.",8000));
        body_4_1.add(new LessonDetails("طارق: هل تنام بعد الصلاة؟","Tarek: Do you sleep after pray?",11000));
        body_4_1.add(new LessonDetails("طاهر: لا ، لا أنام بعد الصلاة.","Taher: No, I don't sleep after prayers.",14000));
        body_4_1.add(new LessonDetails("طارق: ماذا تفعل بعد الصلاة؟","Tarek: What to do after the prayer?",18000));
        body_4_1.add(new LessonDetails("طاهر: أقرأ القرآن.","Taher: Read the Qoran.",21000));
        body_4_1.add(new LessonDetails("طارق: ومتى تذهب إلي المدرسة؟","Tarek: And when did you go to school?",23000));
        body_4_1.add(new LessonDetails("طاهر: أذهب الساعة السابعة.","Taher: Go 7.",27000));
        body_4_1.add(new LessonDetails("طارق: هل تذهب بالسيارة؟","Tarek: Do you go by car?",30500));
        body_4_1.add(new LessonDetails("طاهر: لا، أذهب بالحافلة.","Taher: No, I go by bus.",33500));
        //lesson 4.2
        body_4_2.add(new LessonDetails("الأم: هذا يوم العطلة.","Mother: this holiday.",000));
        body_4_2.add(new LessonDetails("الأب: هذا يوم العمل.","Father: this is a day of work.",3000));
        body_4_2.add(new LessonDetails("الأم: ماذا ستفعل يا طارق؟","Mother: what are you going to do, Tarek?",6000));
        body_4_2.add(new LessonDetails("طارق: سأكنس غرفة الجلوس.","Tarek: I'm sweeping the living room.",9000));
        body_4_2.add(new LessonDetails("الأم: وماذا ستفعلين يا فاطمة؟","Mother: what are you going to do, Fatima?",12000));
        body_4_2.add(new LessonDetails("فاطمة: سأكنس غرفة النوم.","Fatima: I'm sweeping the bedroom.",15000));
        body_4_2.add(new LessonDetails("الأم: وماذا ستفعل يا أحمد ؟","Mother: what are you going to do, Ahmed?",17500));
        body_4_2.add(new LessonDetails("أحمد: سأغسل الملابس.","Ahmed: I wash clothes.",20000));
        body_4_2.add(new LessonDetails("الأم: وماذا ستفعلين يا لطيفة؟","Mother: what are you going to do, Latifa?",23000));
        body_4_2.add(new LessonDetails("لطيفة: سأكوي الملابس.","Latifa: Iron my clothes.",26000));
        body_4_2.add(new LessonDetails("الجدة: أنا سأغسل الأطباق.","Grandma: I'm going to wash the dishes.",29000));
        body_4_2.add(new LessonDetails("الجد: وأنا سأقرأ القرآن.","Grandpa: I am going to read the Qoran.",32000));
        //lesson 4.3
        body_4_3.add(new LessonDetails("عادل: متى تستيقظ يوم العطلة؟","Adel: When did you wake up on the weekend?",0));
        body_4_3.add(new LessonDetails("فيصل: أستيقظ مبكراً.  ومتى تستيقظ أنت؟","Faisal: waking up early. And when you wake up you?",3000));
        body_4_3.add(new LessonDetails("عادل: أستيقظ متأخراً.","Adel: I wake up late.",8500));
        body_4_3.add(new LessonDetails("فيصل: ماذا تفعل في الصباح؟","Faisal: what do you do in the morning?",11000));
        body_4_3.add(new LessonDetails("عادل: أشاهد التلفاز.وماذا تفعل أنت؟","Adel: Watching tv, and what are you doing?",15000));
        body_4_3.add(new LessonDetails("فيصل: أقرأ صحيفة أو كتاباً.","Faisal: read a newspaper or a book.",21000));
        body_4_3.add(new LessonDetails("عادل: أين تصلي الجمعة؟","Adel: Where do you pray Gomoaa?",25000));
        body_4_3.add(new LessonDetails("فيصل: أصلي الجمعة في المسجد الكبير.وأين تصلي أنت؟","Faisal: praying Friday at the Gomoaa Mosque and where to reach you?",28000));
        body_4_3.add(new LessonDetails("عادل: أصلي في المسجد الكبير أيضاً.","Adel: Praying in the Grand Mosque too.",36500));
        //lesson 5.1
        body_5_1.add(new LessonDetails("قاسم: أين تذهب يا سالم؟","Qasim: Salem, where are you going?",0));
        body_5_1.add(new LessonDetails("سالم: إلي المطعم.","Salem: the restaurant.",3000));
        body_5_1.add(new LessonDetails("قاسم: كم وجبة تأكل في اليوم؟","Qasim: how much the meal you eat in a day?",6000));
        body_5_1.add(new LessonDetails("سالم: آكل ثلاث وجبات: الفطور، والغداء ، والعشاء.","Salem: eat three meals: breakfast, lunch, and dinner.",9000));
        body_5_1.add(new LessonDetails("قاسم: هذا كثير جداً، أنا آكل وجبة واحدة.","Qasim: this is too much, I eat one meal.",17000));
        body_5_1.add(new LessonDetails("سالم: هذا قليل جداً.","Salem: that's very small.",24000));
        body_5_1.add(new LessonDetails("قاسم: ماذا تأكل في الغداء؟","Qasim: what are you eating for lunch?",27000));
        body_5_1.add(new LessonDetails("سالم:اكل اللحم والدجاج والارز والخبز وماذا تأكل انت؟","Salem: Eat meat, chicken, rice, bread, what do you eat??",30000));
        body_5_1.add(new LessonDetails("قاسم: آكل السمك والسلطة والفاكهة.","Qasim: eat fish and salads and fruit.",38000));
        body_5_1.add(new LessonDetails("سالم: ما وزنك؟","Salem: what do you weigh?",43000));
        body_5_1.add(new LessonDetails("قاسم: 60 كيلو. وما وزنك أنت؟","Qasim: 60 km. What weight are you?",44000));
        body_5_1.add(new LessonDetails("سالم: 100 كيلو.","Salem: 100 km.",50000));
        body_5_1.add(new LessonDetails("قاسم: أنت سمين جداً.","Qassem: you're too fat.",52000));
        body_5_1.add(new LessonDetails("سالم: وأنت نحيف جداً.","Salem: and you're too skinny.",54000));
        //lesson 5.2
        body_5_2.add(new LessonDetails("المضيفة: ماذا تطلبين من الطعام؟","Hostess:  what are you asking for food?",000));
        body_5_2.add(new LessonDetails("المسافرة: بعض السمك والأرز من فضلك.","Passenger: some fish and rice, please.",3000));
        body_5_2.add(new LessonDetails("المضيفة: وماذا تطلبين من الشراب؟","Hostess: And what are you asking for drink?",6000));
        body_5_2.add(new LessonDetails("المسافرة: ماء من فضلك.","Passenger: water, please.",9500));
        body_5_2.add(new LessonDetails("المضيفة: وماذا تفضلين من الفاكهة.","Hostess: And what would you prefer fruit.",12000));
        body_5_2.add(new LessonDetails("المسافرة: التمر أو العنب.","Passenger: dates or grapes.",16500));
        body_5_2.add(new LessonDetails("المضيفة: هل تشربين الشاي؟","Hostess: Do you drink tea?",20000));
        body_5_2.add(new LessonDetails("المسافرة: لا، أفضل القهوة.","Passenger: no, i prefer coffee.",23500));
        body_5_2.add(new LessonDetails("المضيفة: القهوة بالحليب.","Hostess: Coffee with milk.",28500));
        body_5_2.add(new LessonDetails("المسافرة: نعم، القهوة بالحليب.","Passenger: Yes, coffee with milk.",32000));
        body_5_2.add(new LessonDetails("المسافرة:شكراً.","Passenger: no, thanks.",36000));
        body_5_2.add(new LessonDetails("المضيفة: عفواً.","Hostess: Excuse me.",38000));
        //lesson 5.3
        body_5_3.add(new LessonDetails("الزوج: السلام عليكم.","Husband: Peace be upon you.",0));
        body_5_3.add(new LessonDetails("الزوجة: وعليكم السلام.","Wife: Peace be upon you.",2000));
        body_5_3.add(new LessonDetails("الزوج: أنا جوعان جداً.","Husband: I am very hungry.",5000));
        body_5_3.add(new LessonDetails("الزوجة: الغداء علي المائدة.","Wife: Lunch on the table.",8000));
        body_5_3.add(new LessonDetails("الزوج: ما هذا؟! سمك ولحم ودجاج  وأرز وسلطة وفاكهة! هذا كثير جداً.","Husband: What is this?! Fish, meat, chicken, rice, salad and fruit! That's too much.",11000));
        body_5_3.add(new LessonDetails("الزوجة: لا تأكل...لا تأكل. اجلس.","Wife: Don't eat... Don't eat. Sit down.",18000));
        body_5_3.add(new LessonDetails("الزوج: لماذا؟ أنا جوعان.","Husband: Why? I'm starving.",22000));
        body_5_3.add(new LessonDetails("الزوجة: لدينا ضيوف.","Wife: We have guests.",25000));
        body_5_3.add(new LessonDetails("الزوج: لدينا ضيوف ! من؟!","Husband: we have guests! Who?!",27500));
        body_5_3.add(new LessonDetails("الزوجة: والدي ووالدتي وأخي.","Wife: My father, my mother,and my brother.",31000));
        body_5_3.add(new LessonDetails("الزوج: أين الضيوف؟","Husband: Where are the guests?",34000));
        body_5_3.add(new LessonDetails("الزوجة: في غرفة الجلوس.","Wife: In the living room.",38000));
        //lesson 6.1
        body_6_1.add(new LessonDetails("مصطفي: أين تصلي الصلوات الخمس؟","Mustafa: Where do you pray the five prayers?",000));
        body_6_1.add(new LessonDetails("قصي: أصلي الظهر، والعصر، والمغرب والعشاء في مسجد بلال.","Qusai: I pray Zuhr, ASR, Maghrib and Isha at Bilal Mosque.",4000));
        body_6_1.add(new LessonDetails("مصطفي: وأين تصلي الفجر؟","Mustafa: Where do you pray Fajr?",9000));
        body_6_1.add(new LessonDetails("قصي: أصلي الفجر في البيت.","Qusai: I pray Fajr at home.",12000));
        body_6_1.add(new LessonDetails("مصطفي: لماذا تصلي الفجر في البيت؟","Mustafa: Why do you pray Fajr at home?",15000));
        body_6_1.add(new LessonDetails("قصي: لا أسمع الأذان.","Qusai: I do not hear the Adhaan.",18000));
        body_6_1.add(new LessonDetails("مصطفي: هل تستيقظ متأخراً؟","Mustafa: Do you wake up late?",21000));
        body_6_1.add(new LessonDetails("قصي: نعم، بعد صلاة الفجر.","Qusai: Yes, after Fajr prayer.",24000));
        body_6_1.add(new LessonDetails("مصطفي: استيقظ مبكراً.","Mustafa: Wake up early.",28000));
        body_6_1.add(new LessonDetails("قصي: لا أستطيع ، أعمل في الليل","Qusai: I can't, I work at night",30000));
        body_6_1.add(new LessonDetails("مصطفي: ضع المنبه بجانبك.","Mustafa: Put the alarm next to you.",34000));
        body_6_1.add(new LessonDetails("قصي: هذه فكرة طيبة، جزاك الله خيراً.","Qusai: This is a good idea, may God reward you with good.",37000));
        //lesson 6.2
        body_6_2.add(new LessonDetails("عصام: السلام عليكم.","Essam: Peace be upon you.",000));
        body_6_2.add(new LessonDetails("صالح: وعليكم السلام.","Saleh: Peace be upon you.",2000));
        body_6_2.add(new LessonDetails("عصام: أنا مسافر إلي مكة،  إلي أين أنت مسافر؟","Essam: I am travelling to Mecca, where are you travelling?",5000));
        body_6_2.add(new LessonDetails("صالح: أنا مسافر إلي المدينة. لماذا أنت مسافر إلي مكة؟","Saleh: I am travelling to the Medina. Why are you travelling to Mecca?",10000));
        body_6_2.add(new LessonDetails("عصام: للصلاة في المسجد الحرام.ولماذا أنت مسافر إلي المدينة؟","Essam: To pray in the Holy Mosque. Why are you travelling to the Medina?",16000));
        body_6_2.add(new LessonDetails("صالح: للصلاة في المسجد النبوي.أين تصلي الجمعة؟","Saleh: To pray at the Prophet's mosque. Where will you pray Friday? ",23000));
        body_6_2.add(new LessonDetails("عصام: في المسجد الحرام، إن شاء الله.وأين تصلي الجمعة؟","Essam: In the Holy Mosque, ISA. And where will you pray Friday?",29000));
        body_6_2.add(new LessonDetails("صالح: في المسجد النبوي، إن شاء الله.","Saleh: In the Prophet's mosque, ISA.",35000));
        body_6_2.add(new LessonDetails("عصام: كيف ستسافر إلي المدينة؟","Essam: How will you travel to the Medina?",40000));
        body_6_2.add(new LessonDetails("صالح: أركب الطائرة.","Saleh: Ride the plane.",43000));
        //lesson 6,3
        body_6_3.add(new LessonDetails("صادق: هذا أذان العصر.","Sadek: This is the Adhaan of the Aser.",000));
        body_6_3.add(new LessonDetails("صابر: هيا بنا إلي المسجد.","Saber: Let's go to the mosque.",3000));
        body_6_3.add(new LessonDetails("صادق: أنا أصلي في البيت.","Sadek: I pray at home.",6000));
        body_6_3.add(new LessonDetails("صابر:صلً فى المسجد.","Saber: Pray in the mosque.",8500));
        body_6_3.add(new LessonDetails("صادق: المسجد بعيد.","Sadiq: The mosque is far away.",11000));
        body_6_3.add(new LessonDetails("صابر: المسجد قريب. هل أنت مريض؟","Saber: The mosque is nearby. Are you sick?",13000));
        body_6_3.add(new LessonDetails("صادق: لا، أنا بخير.","Sadek: No, I'm fine.",19000));
        body_6_3.add(new LessonDetails("صابر: أنت كسلان.","Saber: You are lazy.",22000));
        body_6_3.add(new LessonDetails("صادق: هذا صحيح. آسف.","Sadek: That's right. Sorry.",25000));
        body_6_3.add(new LessonDetails("صابر: أنا ذاهب إلي المسجد.","Saber: I am going to the mosque.",28000));
        body_6_3.add(new LessonDetails("صادق: انتظر، أنا ذاهب معك.","Sadek: Wait, I'm going with you.",32000));
        //lesson 7.1
        body_7_1.add(new LessonDetails("غانم: انظر إلي اللوحة. اقرأ الجدول الدراسي.","Ghanem: Look at the painting. Read the course schedule.",000));
        body_7_1.add(new LessonDetails("غالب: الدراسة خمسة أيام في الأسبوع.","Ghaleb: Study five days a week.",5000));
        body_7_1.add(new LessonDetails("غانم: نعم، يوم السبت، ويوم الأحد، ويوم الاثنين،  ويوم الثلاثاء، ويوم الأربعاء.","Ghanem: Yes, on Saturday, Sunday, Monday, Tuesday, and Wednesday.",10000));
        body_7_1.add(new LessonDetails("غالب: العطلة يوم الخميس، ويوم الجمعة.","Ghalib: Holiday on Thursday and Friday.",25000));
        body_7_1.add(new LessonDetails("غانم: اكتب المواد الدراسية.","Ghanem: Write course materials.",30000));
        body_7_1.add(new LessonDetails("غالب: الثقافة الإسلامية ، واللغة العربية، والرياضيات، والعلوم، والحاسوب. متى تبدأ الاختبارات؟ ","Ghaleb: Islamic culture, Arabic language, mathematics, science, and computer. When do tests start?",34000));
        body_7_1.add(new LessonDetails("غانم: في شهر شعبان.","Ghanem: In the month of Shaaban.",48000));
        body_7_1.add(new LessonDetails("غالب: ومتى ينتهي العام الدراسي؟","Ghalib: When does the school year end?",50500));
        body_7_1.add(new LessonDetails("غانم: في شهر رمضان.","Ghanem: In the month of Ramadan.",54500));
        body_7_1.add(new LessonDetails("غالب: العطلة ثلاثة أشهر.","Ghalib: three months vacation.",57000));
        body_7_1.add(new LessonDetails("غانم: الحمد لله، العطلة طويلة.","Ghanem: Praise be to Allah, long vacation.",60000));
        body_7_1.add(new LessonDetails("غالب: بدأت الحصة، وجاء المعلم. هيا بنا إلي الصف.","Ghaleb: The class began, and the teacher came. Let's go to class.",65000));
        body_7_1.add(new LessonDetails("غانم: هيا بنا.","Ghanem: Let's go.",72000));
        //lesson 7.2
        body_7_2.add(new LessonDetails("ندي: السلام عليكم.","Nada: Peace be upon you.",000));
        body_7_2.add(new LessonDetails("إلهام: وعليكم السلام.","Ilham: Peace be upon you.",2000));
        body_7_2.add(new LessonDetails("ندي: اسمي ندي. أنا سورية.","Nada: My name is nada. I am Syrian.",4000));
        body_7_2.add(new LessonDetails("إلهام: اسمي إلهام. أنا سعودية.","Ilham: My name is Ilham. I'm a Saudi.",8000));
        body_7_2.add(new LessonDetails("ندي: أنا طالبة في جامعة دمشق.","Nada: I am a student at Damascus University.",13000));
        body_7_2.add(new LessonDetails("إلهام: أنا طالبة في جامعة أم القري.","Ilham: I am a student at Umm al-Qura University.",17000));
        body_7_2.add(new LessonDetails("ندي: في أي كلية تدرسين؟","Nada: What college Are you studying?",23000));
        body_7_2.add(new LessonDetails("إلهام: أدرس في كلية التربية. وفي أي كلية تدرسين أنت؟"," Ilham: study at the College of Education. And what college are you studying?",26000));
        body_7_2.add(new LessonDetails("ندي: أدرس في كلية الطب.","Nada: I study at the Faculty of Medicine.",36000));
        body_7_2.add(new LessonDetails("إلهام: سأكون مدرسة، إن شاء الله.","Ilham: I'll be a teacher, ISA.",40000));
        body_7_2.add(new LessonDetails("ندي: سأكون طبيبة، إن شاء الله.","Nada: I'll be a doctor, ISA.",45000));
        //lesson 7.3
        body_7_3.add(new LessonDetails("قاسم: أين تذهب يا غسان؟","Kasem: Where are you going, Ghassan?",000));
        body_7_3.add(new LessonDetails("غسان: أذهب إلي المدرسة.","Ghassan: Go to school.",3000));
        body_7_3.add(new LessonDetails("قاسم: الوقت مبكر. الساعة الآن السادسة صباحاً.","Qasim: It's early. It's 6:00 a.m.",6000));
        body_7_3.add(new LessonDetails("غسان: المدرسة بعيدة عن البيت.","Ghassan: The school is far from home.",12000));
        body_7_3.add(new LessonDetails("قاسم: متى يبدأ اليوم الدراسي؟","Qasem: When does the school day start?",16000));
        body_7_3.add(new LessonDetails("غسان: يبدأ الساعة السابعة صباحاً.","Ghassan: Starts at 7:00 am.",20000));
        body_7_3.add(new LessonDetails("قاسم: هل تذهب بالحافلة.","Qasem: Do you go by bus?",24000));
        body_7_3.add(new LessonDetails("غسان: لا، أذهب بالسيارة.","Ghassan: No, go by car.",27000));
        body_7_3.add(new LessonDetails("قاسم: متى ينتهي اليوم الدراسي؟","Qasem: When does the school day end?",31000));
        body_7_3.add(new LessonDetails("غسان: ينتهي الساعة الواحدة ظهراً.","Ghassan: One o'clock ends at noon.",34000));
        body_7_3.add(new LessonDetails("قاسم: كم حصة تدرس في اليوم؟","Qasem: How many classes are you studying in the day?",38000));
        body_7_3.add(new LessonDetails("غسان: أدرس ست حصص في اليوم.","Ghassan: I study six servings a day.",41000));
        body_7_3.add(new LessonDetails("قاسم: ماذا تفعل في الاستراحة؟","Qasem: What are you doing at the break?",45000));
        body_7_3.add(new LessonDetails("غسان: أذهب إلي المكتبة. أو إلي المختبر.","Ghassan: Go to the library. or to the lab.",48000));
        //lesson 8.1
        body_8_1.add(new LessonDetails("عثمان: أعمل طبيباً، ماذا تعمل أنت؟","Osman: I'm a doctor, what do you do?",000));
        body_8_1.add(new LessonDetails("علي: أعمل مهندساً.","Ali: I work as an engineer.",4000));
        body_8_1.add(new LessonDetails("عثمان: أين تعمل؟","Osman: Where do you work?",7000));
        body_8_1.add(new LessonDetails("علي: أعمل في شركة،أين تعمل أنت؟","Ali: I work for a company, where do you work?",9000));
        body_8_1.add(new LessonDetails("عثمان: أعمل في المستشفي.","Osman: I work in the hospital.",16000));
        body_8_1.add(new LessonDetails("علي: كم ساعة تعمل في اليوم؟","Ali: How many hours do you work in a day?",18000));
        body_8_1.add(new LessonDetails("عثمان: أعمل ثماني ساعات في اليوم","Osman: I work eight hours a day",22000));
        body_8_1.add(new LessonDetails(" وكم ساعة تعمل أنت؟"," How many hours do you work?",26000));
        body_8_1.add(new LessonDetails("علي: أعمل سبع ساعات.","Ali: I work seven hours.",29000));
        body_8_1.add(new LessonDetails("عثمان: هل تحب عملك؟","Osman: Do you like your work?",32000));
        body_8_1.add(new LessonDetails("علي: نعم، أحب عملي.","Ali: Yes, I like my work.",35000));
        body_8_1.add(new LessonDetails("عثمان: وأنا أحب عملي أيضاً.","Osman: And I love my work too.",38000));
        //lesson 8.2
        body_8_2.add(new LessonDetails("الطالب الأول: ماذا سنعمل بعد الدراسة؟","First Student: What will we do after school?",000));
        body_8_2.add(new LessonDetails("الطالب الثاني: أنا أدرس الطب في كلية الطب ، سأعمل طبيبا، إن شاء الله.","Second student: I am studying medicine at the medical school.",3000));
        body_8_2.add(new LessonDetails("الطالب الثالث: أنا أدرس الصيدلة في كلية الصيدلة، سأعمل صيدلياً، إن شاء الله.","Third student: I am studying pharmacy at the faculty of Pharmacy, I will work as a pharmacist, ISA.",12000));
        body_8_2.add(new LessonDetails("الطالب الرابع: أنا أدرس التمريض في كلية التمريض، سأعمل ممرضاً، إن شاء الله.","Fourth student: I am studying nursing in the nursing school, I will be a nurse, ISA.",22000));
        body_8_2.add(new LessonDetails("الطالب الخامس: أنا أدرس الهندسة في كلية الهندسة، سأعمل مهندساً، إن شاء الله.","Fifth student: I am studying engineering at the College of Engineering, I will work as an engineer, ISA.",32000));
        body_8_2.add(new LessonDetails("الطالب السادس: أنا أدرس الطيران في كلية الطيران، سأعمل طياراً، إن شاء الله.","Sixth student: I'm studying aviation at the Aviation College, I'm going to be a pilot, ISA.",43000));
        body_8_2.add(new LessonDetails("الطالب الأول: أنا أدرس التربية في كلية التربية، سأعمل مدرساً، إن شاء الله.","First Student: I studying education at the College of Education, I will be a teacher, ISA.",53000));
       //lesson 8.3
        body_8_3.add(new LessonDetails("مريم: أنا مدرسة. ما مهنتك؟","Mariam: I am a teacher. What's your profession?",000));
        body_8_3.add(new LessonDetails("زينب: أنا مدرسة أيضاً.","Zainab: I am a teacher too.",3000));
        body_8_3.add(new LessonDetails("مريم: في أي مرحلة تدرسين؟","Mariam: At what stage do you study?",6000));
        body_8_3.add(new LessonDetails("زينب: أدرس في المرحلة الابتدائية, وفي أي مرحلة تدرسين أنت؟","Zainab: I study at the elementary level, and at what stage do you study?",10000));
        body_8_3.add(new LessonDetails("مريم: أدرس في المرحلة المتوسطة.","Mariam: I study in middle school.",18000));
        body_8_3.add(new LessonDetails("زينب: هل لك أطفال؟","Zainab: Do you have children?",22000));
        body_8_3.add(new LessonDetails("مريم: نعم، لي أطفال.","Mariam: Yes, I have children.",24000));
        body_8_3.add(new LessonDetails("زينب: كم طفلاً لك؟","Zainab: How many children do you have?",27000));
        body_8_3.add(new LessonDetails("مريم: لي خمسة أطفال.","Mariam: I have five children.",30000));
        body_8_3.add(new LessonDetails("زينب: هل تحبين عملك؟","Zainab: Do you like your work?",33000));
        body_8_3.add(new LessonDetails("مريم: نعم، أحب عملي.","Mariam: Yes, I like my work.",36000));
        body_8_3.add(new LessonDetails("زينب: أنا أحب عملي أيضاً.","Zainab: I love my work too.",38000));
        //lesson 9.1
        body_9_1.add(new LessonDetails("البائع: أهلاً وسهلاً","Seller: Welcome",0));
        body_9_1.add(new LessonDetails("الطالب: أريد معجماً من فضلك.","Student: I want a glossary please.",2000));
        body_9_1.add(new LessonDetails("البائع: أي معجم تريد؟","Seller: Which glossary do you want?",6000));
        body_9_1.add(new LessonDetails("الطالب: أريد المعجم العربي.","Student: I want the Arabic glossary.",9000));
        body_9_1.add(new LessonDetails("البائع: تفضل المعجم العربي. وماذا تريد أيضاً؟","Seller: Prefer the Arabic dictionary. What else do you want?",12000));
        body_9_1.add(new LessonDetails("الطالب: أريد كتاب القراءة، وكتاب القواعد.","Student: I want the book of Reading, the Book of rules.",18000));
        body_9_1.add(new LessonDetails("البائع: هذا كتاب القراءة، وهذا كتاب القواعد.","Seller: This book of reading, this book of rules.",24000));
        body_9_1.add(new LessonDetails("الطالب: أريد دفتراً وقلماً.","Student: I want a book and a pen.",30000));
        body_9_1.add(new LessonDetails("البائع: تفضل الدفتر والقلم. هل تريد شيئاً آخر؟","Seller: Here the book and pen. You want something else?",33000));
        body_9_1.add(new LessonDetails("الطالب: لا، وشكراً.","Student: No, thanks.",40000));
        body_9_1.add(new LessonDetails("البائع: المطلوب ثلاثون ريالاً.","Seller: Required Thirty riyals.",44000));
        body_9_1.add(new LessonDetails("الطالب: ماذا تقول؟ ثلاثون ريالاً.","Student: What do you say? Thirty riyals.",47000));
        body_9_1.add(new LessonDetails("البائع: نعم، ثلاثون ريالاً.","Seller: Yes, thirty riyals.",51000));
        body_9_1.add(new LessonDetails("الطالب: تفضل، هذه ثلاثون ريالاً.","Student: Here, this is 30 riyals.",55000));
        //lesson 9.2
        body_9_2.add(new LessonDetails("البائع: مرحباً، أي خدمة.","Seller: Hi, any service.",0));
        body_9_2.add(new LessonDetails("المرأة: أريد سمكاً ولحماً ودجاجاً.","Women: I want fish, meat and chicken.",3000));
        body_9_2.add(new LessonDetails("البائع: تفضلي السمك واللحم والدجاج. وماذا تريدين أيضاً؟","Seller: Here is the fish, meat and chicken.   What else do you want?",7000));
        body_9_2.add(new LessonDetails("المرأة: أريد خياراً وبصلاً وطماطم.","Women: I want cucumbers, onions and tomatoes.",15000));
        body_9_2.add(new LessonDetails("البائع: تفضلي الخيار والبصل والطماطم. وماذا تريدين أيضاً؟","Seller: Choose the cucumber, onion and tomato. What else do you want?",21000));
        body_9_2.add(new LessonDetails("المرأة: أريد سكراً وشاياً و᾿بناً.","Women: I want sugar, tea and coffee.",29000));
        body_9_2.add(new LessonDetails("البائع: تفضلي السكر والشاي والبن. هل تريدين شيئاً آخر؟","Seller: Here's sugar, tea and coffee. Do you want anything else?",34000));
        body_9_2.add(new LessonDetails("المرأة: نعم، طبق بيض، وعلبة ملح.","Women: Yes, egg platter, salt tray.",42000));
        body_9_2.add(new LessonDetails("البائع: هذا طبق البيض، وهذه علبة الملح. المطلوب ثمانون ديناراً.","Seller: This egg dish, this can salt. Required eighty dinars.",47000));
        body_9_2.add(new LessonDetails("المرأة: تفضل، هذه ثمانون ديناراً.","Women: Here, this is 80 dinars.",57000));
        //lesson 9.3
        body_9_3.add(new LessonDetails("البائع: تفضل، أي خدمة.","Seller: Come on, any service.",0));
        body_9_3.add(new LessonDetails("المشتري: أريد قميصاً لو سمحت.","Buyer: I want a shirt, please.",3000));
        body_9_3.add(new LessonDetails("البائع: تفضل هنا، هذا قسم القمصان. هذا قميص أبيض، وهذا أصفر،وهذا أزرق، وهذا أحمر، وهذا أسود.","Seller: Here you go, this is the shirts section. This is a white shirt, this is yellow, this is blue, this is red, this is black.",6000));
        body_9_3.add(new LessonDetails("المشتري: بكم القميص؟","Buyer: how much the price of the shirt?",23000));
        body_9_3.add(new LessonDetails("البائع: القميص بعشرين ديناراً. أي قميص تريد؟","Seller: T-shirt with 20 dinars. What shirt do you want?",25000));
        body_9_3.add(new LessonDetails("المشتري: سأشتري القميص الأزرق.","Buyer: I'll buy the blue shirt.",31000));
        body_9_3.add(new LessonDetails("البائع: هذا هو القميص الأزرق.","Seller: This is a blue shirt.",33500));
        body_9_3.add(new LessonDetails("المشتري: شكراً.","Buyer: Thank you.",35500));
        body_9_3.add(new LessonDetails("البائع: لدينا أثواب جميلة.","Seller: We have beautiful gowns.",37000));
        body_9_3.add(new LessonDetails("المشتري: بكم الثوب؟","Buyer: How much is your dress?",40000));
        body_9_3.add(new LessonDetails("البائع: الثوب بثلاثين ديناراً.","Seller: The dress is 30 dinars.",42000));
        body_9_3.add(new LessonDetails("المشتري: أريد الثوب الأبيض.","Buyer: I want the white dress.",45500));
        body_9_3.add(new LessonDetails("البائع: تفضل الثوب الأبيض، المطلوب خمسون ديناراً.","Seller: Here is the white dress, required fifty dinars.",48000));
        body_9_3.add(new LessonDetails("المشتري: تفضل، هذه خمسون ديناراً.","Buyer: Here, this is 50 dinars.",53000));
        //lesson 10.1
        body_10_1.add(new LessonDetails("الزوجة: كيف الجو في الخارج؟","Wife: how the weather outside?",0));
        body_10_1.add(new LessonDetails("الزوج: السماء تمطر الآن؛ هذا فصل الخريف.","Husband: it's raining now; this autumn.",3000));
        body_10_1.add(new LessonDetails("الزوجة: ثوبك مبتل. أين المعطف؟","Wife: your dress all wet. Where is your coat?",9000));
        body_10_1.add(new LessonDetails("الزوج: تركته في الشركة","Husband: left it in the company",14000));
        body_10_1.add(new LessonDetails("الزوجة: وأين المظلة؟","Wife: and where the parachute?",17000));
        body_10_1.add(new LessonDetails("الزوج: تركتها في السيارة.","Husband: left it in the car",20000));
        body_10_1.add(new LessonDetails("الزوجة: اشرب هذا الشاي الدافئ.","Wife: drink this warm tea.",23000));
        body_10_1.add(new LessonDetails("الزوج: بارك الله فيك.","Husband:may Allah blessed you.",27000));
        body_10_1.add(new LessonDetails("الزوجة: هل نخرج إلي السوق الآن؟","Wife: shall we go out to the market now?",31000));
        body_10_1.add(new LessonDetails("الزوج: الماء كثير جداً في الخارج.","Husband: too much water outside.",35000));
        body_10_1.add(new LessonDetails("الزوجة: ماذا نفعل؟","Wife: what do we do?",38000));
        body_10_1.add(new LessonDetails("الزوج: نبقي الليلة في البيت.","Husband: stay the night at home.",40000));
        body_10_1.add(new LessonDetails("الزوجة: ونذهب غداً إلي السوق، إن شاء الله.","Wife: and go tomorrow, ISA.",43000));
        body_10_1.add(new LessonDetails("الزوج: هذه فكرة طيبة.","Husband: good idea.",47000));
        //lesson 10.2
        body_10_2.add(new LessonDetails("حسان: السلام عليكم يا بدر. أنا حسان، أتكلم من لندن.","Hassan: Hello, Bader. I am Hassan, speaking from London.",0));
        body_10_2.add(new LessonDetails("بدر: وعليكم السلام يا حسان. كيف الجو في لندن؟","Bader: Hello, Hassan. How the weather in London?",8000));
        body_10_2.add(new LessonDetails("حسان: الجو بارد في لندن. هذا فصل الشتاء.","Hassan: cold weather in London. This winter.",13000));
        body_10_2.add(new LessonDetails("بدر: كم درجة الحرارة في لندن؟","Bader: how the temperature in London?",18000));
        body_10_2.add(new LessonDetails("حسان: تحت الصفر. كيف الجو في الرياض؟","Hassan: below zero. How the weather in Riyadh?",21000));
        body_10_2.add(new LessonDetails("بدر: كان الجو حاراً، وهو الآن معتدل.","Bader: weather was warm and is mild.",25000));
        body_10_2.add(new LessonDetails("حسان: كم درجة الحرارة في الرياض؟","Hassan: how the temperature in Riyadh?",29000));
        body_10_2.add(new LessonDetails("بدر: درجة الحرارة عشرون","Bader: temperature 20",33000));
        body_10_2.add(new LessonDetails("حسان: هل ستقضي العطلة في لندن؟","Hassan: are you going to spend the weekend in London?",35000));
        body_10_2.add(new LessonDetails("بدر: لا، سأقضيها في تونس، إن شاء الله.","Bader: no, I'll spend in Tunisia, ISA.",39000));
        //lesson 10.3
        body_10_3.add(new LessonDetails("خالد: الجو معتدل هذه الأيام.","Khaled: mild weather these days.",0));
        body_10_3.add(new LessonDetails("حازم: هذا فصل الربيع.","Hazem: this spring.",3000));
        body_10_3.add(new LessonDetails("خالد: الحمد لله، ذهب الصيف، وذهب الحر.","Khalid: thank Allah, summer went, went free.",5000));
        body_10_3.add(new LessonDetails("حازم: وذهب الشتاء، وذهب البرد.","Hazem: the winter went, went cold.",14000));
        body_10_3.add(new LessonDetails("خالد: أين نقضي عطلة الأسبوع؟","Khaled: where to spend the weekend?",18000));
        body_10_3.add(new LessonDetails("حازم: نذهب إلي الشاطئ.","Hazem: go to the beach.",23000));
        body_10_3.add(new LessonDetails("خالد: الشاطئ بعيد، نذهب إلي البر.","Khalid: the beach is far, go to the Mainland.",25000));
        body_10_3.add(new LessonDetails("حازم: هذه فكرة طيبة، نذهب إلي البر.","Hazem: this good idea, go to the Mainland.",31000));
        body_10_3.add(new LessonDetails("خالد: سأحضر الخيمة والسجادة.","Khalid: I'll bring tent and carpet.",38000));
        body_10_3.add(new LessonDetails("حازم: سأحضر الطعام والشراب.","Hazim: I'll bring food and drink.",41000));
        body_10_3.add(new LessonDetails("خالد: أسرتي ستحضر معي.","Khaled:  my family will come with me.",45000));
        body_10_3.add(new LessonDetails("حازم: وأسرتي ستحضر معي أيضاً.","Hazem: my family will come with me too.",49000));
        //lesson 11.1
        body_11_1.add(new LessonDetails("ثابت: لماذا تركت العراق؟","Thabit: why did you leave Iraq?",0));
        body_11_1.add(new LessonDetails("حارث: انتقلت الشركة إلي جدة. وأنا مدير الشركة هنا.","Harith: the company moved to Jeddah. I'm Director of the company here.",2000));
        body_11_1.add(new LessonDetails("ثابت: كنت سعيداً في العراق؟","Thabit: ware are you happy in Iraq?",10000));
        body_11_1.add(new LessonDetails("حارث: هذا صحيح، العراق بلد جميل.ولي أصدقاء هناك.","Harith: that's right, Iraq is a beautiful country, and I have friends there.",12000));
        body_11_1.add(new LessonDetails("ثابت: ما رأيك في جدة؟","Thabit: what do you think in Jeddah?",19000));
        body_11_1.add(new LessonDetails("حارث: جدة مدينة كبيرة ، وجميلة جداً.","Harith: Jeddah the big city, and very beautiful.",22000));
        body_11_1.add(new LessonDetails("ثابت: كيف تقضي الوقت في جدة؟","Thabit: how you spend time in Jeddah?",28000));
        body_11_1.add(new LessonDetails("حارث: أذهب مع الأسرة إلي شاطئ البحر.","Harith: go with the family to the seaside.",31000));
        body_11_1.add(new LessonDetails("ثابت: و أين تذهب الآن؟","Thabit: and where are you going now?",35000));
        body_11_1.add(new LessonDetails("حارث: أذهب إلي مكة؛ للعمرة. والصلاة في المسجد الحرام.","Harith: go to Makkah,for Umrah. And pray in the mosque.",38000));
        body_11_1.add(new LessonDetails("ثابت: كم تستغرق الرحلة إلي مكة؟","Thabit: how it takes the journey to Mecca?",43000));
        body_11_1.add(new LessonDetails("حارث: تستغرق ساعة واحدة تقريباً.","Harith: approximately one hour",47000));
        //lesson 11.2
        body_11_2.add(new LessonDetails("ليث: من أين حضرت؟","Leith where you come from ?",0));
        body_11_2.add(new LessonDetails("ثامر: حضرت من اليمن.انا يمنى","Thamer: i came from Yemen i am Yemeni.",2000));
        body_11_2.add(new LessonDetails("ليث: ومتى حضرت من اليمن؟","Leith when did you come from Yemen?",6000));
        body_11_2.add(new LessonDetails("ثامر: حضرت قبل عشر سنوات.","Thamer: 10 years ago",9000));
        body_11_2.add(new LessonDetails("ليث: هل معك الجنسية اليمنية.","Leith: do you have Yemeni nationality.",12000));
        body_11_2.add(new LessonDetails("ثامر: نعم، ومعي جواز السفر اليمني.","Thamer: yes and i have the Yemeni passport",14500));
        body_11_2.add(new LessonDetails("ليث: هل حضرت للعمل؟","Leith: did you come to work?",19000));
        body_11_2.add(new LessonDetails("ثامر: لا، حضرت للدراسة، وبعد الدراسة تزوجت.","Thamer: no,i came to study, after study i got married.",21000));
        body_11_2.add(new LessonDetails("ليث: وماذا تعمل هنا؟","Leith: what are you doing here?",26000));
        body_11_2.add(new LessonDetails("ثامر: أنا أستاذ في الجامعة.","Thamer: I am a professor at the University.",29000));
        body_11_2.add(new LessonDetails("ليث: هل تزور اليمن؟","Leith: did you visiting Yemen?",31000));
        body_11_2.add(new LessonDetails("ثامر: نعم، أقضي العطلة مع الأسرة في اليمن.","Thamer: Yes, spend the holiday with family in Yemen.",32800));
        body_11_2.add(new LessonDetails("ليث: هل أنت سعيد هنا؟","Leith: are you happy here?",37000));
        body_11_2.add(new LessonDetails("ثامر: نعم، والحمد لله.","Thamer: Yes, praise be to Allah.",39500));
        //lesson 11.3
        body_11_3.add(new LessonDetails("أحمد: أين تسكن الآن يا بدر؟","Ahmed: where you live now, Bader?",0));
        body_11_3.add(new LessonDetails("بدر: أسكن في القرية.","Bader: I live in the village.",3000));
        body_11_3.add(new LessonDetails("أحمد: لماذا تركت المدينة؟","Ahmed: why did you leave town?",6000));
        body_11_3.add(new LessonDetails("بدر: القرية هادئة، والهواء نقي.","Bader: the village is quiet, and the air is clean.",9000));
        body_11_3.add(new LessonDetails("أحمد: ولكن في المدينة جامعات، ومستشفيات، وشركات، وأسواق.","Ahmed: but the city universities, hospitals, companies and markets.",12000));
        body_11_3.add(new LessonDetails("بدر: وفي المدينة أيضاً ضوضاء، وتلوث وازدحام.","Bader: in the city also noise, pollution and traffic congestion.",21000));
        body_11_3.add(new LessonDetails("أحمد: لماذا تسكن في القرية، وأنت تعمل في المدينة؟","Ahmed: why do you live in the village, and you work in the city?",26000));
        body_11_3.add(new LessonDetails("بدر: ليس هناك مشكلة.","Bader: no problem.",31000));
        body_11_3.add(new LessonDetails("أحمد: كيف تذهب إلي المدينة؟","Ahmed: how to go to town?",34000));
        body_11_3.add(new LessonDetails("بدر: أذهب بالقطار.","Bader: by train.",37000));
        body_11_3.add(new LessonDetails("أحمد: كم تستغرق الرحلة إلي المدينة؟","Ahmed: how it takes the journey to town?",40000));
        body_11_3.add(new LessonDetails("بدر: تستغرق ساعة ونصف الساعة تقريباً.","Bader: it lasts an hour and a half.",44000));
        //lesson 12.1
        body_12_1.add(new LessonDetails("شاكر: ما هوايتك يا شريف؟","Shaker: what's your hobby, Sheriff?",0));
        body_12_1.add(new LessonDetails("شريف: هواياتي كثيرة القراءة، والسفر والمراسلة، وما هواياتك أنت؟","Sheriff: many hobbies reading, travel and correspondence, what your hobbies are you?",3000));
        body_12_1.add(new LessonDetails("شاكر: هواياتي: الرياضة، والرحلات، والقراءة أيضاً.","Shaker: my hobbies: sports, travels, reading, too.",12000));
        body_12_1.add(new LessonDetails("شريف: ماذا تقرأ يا شاكر؟","Sheriff: what you read, Shaker?",18500));
        body_12_1.add(new LessonDetails("شاكر: أقرأ الكتب والمجلات الإسلامية.وماذا تقرأ أنت؟","Shaker: reading Islamic books and magazines, and what you read?",21000));
        body_12_1.add(new LessonDetails("شريف: أقرأ الكتب الإسلامية، والمجلات العلمية.","Sheriff: reading Islamic books and scientific journals.",28000));
        body_12_1.add(new LessonDetails("شاكر: هل لديك مكتبة؟","Shakir: do you have a library?",33000));
        body_12_1.add(new LessonDetails("شريف: نعم، لدي مكتبة كبيرة.","Sheriff: Yes, I have a large library.",35000));
        body_12_1.add(new LessonDetails("شاكر: كم ساعة تقرأ في اليوم؟","Shaker: how many hours you read in the day?",39000));
        body_12_1.add(new LessonDetails("شريف: أقرأ ثلاث ساعات تقريباً.","Sheriff: read about three hours.",42000));
        body_12_1.add(new LessonDetails("شاكر: أنا أقرأ أربع ساعات في اليوم.","Shaker: I read four hours a day.",46000));
        body_12_1.add(new LessonDetails("شريف: القراءة هواية مفيدة.","Sheriff: reading is a useful hobby.",49000));
        //lesson 12.2
        body_12_2.add(new LessonDetails("شهاب: هل زرت معرض الهوايات؟","Shahab: did you visit Gallery hobbies?",0));
        body_12_2.add(new LessonDetails("شعيب: لا، ما زرته، هيا بنا إليه.","Shoaib: no i did not, let us go and visit it",4000));
        body_12_2.add(new LessonDetails("شهاب: هذا هو معرض الهوايات.","Shahab: this is a gallery of hobbies.",9000));
        body_12_2.add(new LessonDetails("شعيب: هذه هوايات كثيرة جداً.","Shoaib: This is too many hobbies.",13000));
        body_12_2.add(new LessonDetails("شهاب: هذا جناح جمع الطوابع.","Shahab: this stamp collection suite.",17000));
        body_12_2.add(new LessonDetails("شعيب: هذه طوابع جميلة. هذا طابع هندي، وهذا طابع فرنسي.","Shoaib: these beautiful stamps. This is an Indian stamp, this French stamp.",21000));
        body_12_2.add(new LessonDetails("شهاب: وهذا جناح الخط العربي.","Shahab: this pavilion of arabic calligraphy.",31000));
        body_12_2.add(new LessonDetails("شعيب: هذه ايات بخط النسخ، وتلك احاديث بخط الرقعة.","Shoaib: these verses of Naskh, and those conversations to Ruq'ah.",35000));
        body_12_2.add(new LessonDetails("شهاب: وهذا جناح الصحافة.","Shahab: this press suite.",43000));
        body_12_2.add(new LessonDetails("شعيب: وهذه صحف بجميع اللغات.","Shoaib: these newspapers in all languages.",46000));
        body_12_2.add(new LessonDetails("شهاب: وهذا جناح التدبير المنزلي.","Shahab: this housekeeping suite.",50000));
        body_12_2.add(new LessonDetails("شعيب: هذا طعام صيني، وهذا طعام عربي.","Shoaib: this Chinese food, this Arabic food.",56000));
        body_12_2.add(new LessonDetails("شهاب: وهذا جناح الرياضة.","Shahab: this wing of the sport.",62000));
        body_12_2.add(new LessonDetails("شعيب: كرة القدم، والسباحة، والفروسية.","Shoaib: football, swimming and Equestrian.",66000));
        //lesson 12.3
        body_12_3.add(new LessonDetails("المُدرسة: أي جمعية تختارين يا شريفة؟","Teacher: which  an association you choose Sheriffa? ",0));
        body_12_3.add(new LessonDetails("شريفة: أختار جمعية الصحافة.","Sheriffa: Select the Press Association.",3000));
        body_12_3.add(new LessonDetails("المُدرسة: أي جمعية تختارين يا شادية؟","Teacher: which  an association you choose Shadia? ",6000));
        body_12_3.add(new LessonDetails("شادية: أختار جمعية الثقافة الإسلامية.","Shadia: Choose an Association of Islamic culture.",10000));
        body_12_3.add(new LessonDetails("المُدرسة: أي جمعية تختارين يا شيماء؟","Teacher: which  an association you choose Shaimaa? ",14000));
        body_12_3.add(new LessonDetails("شيماء: أختار جمعية الحاسوب.","Shaimaa: Pick a computer Association.",18000));
        body_12_3.add(new LessonDetails("المُدرسة: أي جمعية تختارين يا شقراء؟","Teacher: which  an association you choose Shaqraa?",21000));
        body_12_3.add(new LessonDetails("شقراء: أختار جمعية العلوم.","Shaqraa:Choose the Science Association. ",24000));
        body_12_3.add(new LessonDetails("المُدرسة: أي جمعية تختارين يا شمس؟","Teacher: which  an association you choose Shams?",27000));
        body_12_3.add(new LessonDetails("شمس: أختار جمعية اللغة العربية، أنا أحب  الخط العربي، ولدي آيات بخط النسخ، وأحاديث بخط الرقعة.","Shams: Choose Arabic language society, I love the calligraphy, the verses of Naskh, and conversations with a vamp.",30000));
        body_12_3.add(new LessonDetails("المُدرسة: أي جمعية تختارين يا سميرة؟","Teacher: which  an association you choose Samira?",39000));
        body_12_3.add(new LessonDetails("سميرة: أختار جمعية التدبير المنزلي، أنا أحب المطبخ والخياطة.","Samira: Housekeeping Association chose, I love the kitchen and sewing.",42000));
        //lesson 13.1
        body_13_1.add(new LessonDetails("الموظف: أي خدمة؟","Employee: how can i serve you?",0));
        body_13_1.add(new LessonDetails("المسافر: لدي حجز إلي جدة، وأريد تأكيد الحجز.","Traveler: I have a reservation to Jeddah, I want confirmation.",1500));
        body_13_1.add(new LessonDetails("الموظف: هل الحجز علي الخطوط السعودية؟","Employee: do the booking on Saudi Arabian Airlines?",8000));
        body_13_1.add(new LessonDetails("المسافر: لا، هو علي الخطوط الإندونيسية.","Traveler: No, it is on Indonesian Airlines.",12000));
        body_13_1.add(new LessonDetails("الموظف: أين التذاكر؟","Employee: Where are the tickets?",16000));
        body_13_1.add(new LessonDetails("المسافر: هذه هي التذاكر: تذكرتي، وتذكرة زوجتي.وتذكرة ابني، وتذكرة ابنتي.","Traveler: These are the tickets: my ticket, my wife's ticket. My son's ticket, and my daughter's ticket.",17000));
        body_13_1.add(new LessonDetails("الموظف: وأين جوازات السفر؟","Employee: Where are the passports?",28000));
        body_13_1.add(new LessonDetails("المسافر: هذه هي جوازات السفر.","Traveler: These are passports.",31000));
        body_13_1.add(new LessonDetails("الموظف: أين تأشيرة الخروج؟","Employee: Where is the exit visa?",34000));
        body_13_1.add(new LessonDetails("المسافر: هذه تأشيرة الخروج، وهذه تأشيرة الدخول.","Traveler: This is an exit visa, and this visa.",37000));
        body_13_1.add(new LessonDetails("الموظف: الرحلة رقم 777. تغادر الطائرة الساعة الثالثة فجراً. احضر إلي المطار قبل ساعتين.","Employee: Flight 777. The plane leaves at 3:00 am. Be to the airport two hours before.",43000));
        body_13_1.add(new LessonDetails("المسافر: شكراً.","Traveler: Thanks.",55000));
        body_13_1.add(new LessonDetails("الموظف: رحلة سعيدة.","Employee: Happy trip.",56000));
        //lesson 13.2
        body_13_2.add(new LessonDetails("المسافر: السلام عليكم.","Traveler: Peace be upon you.",0));
        body_13_2.add(new LessonDetails("الضابط: وعليكم السلام. أهلاً وسهلاً. جواز السفر من فضلك. ","Officer: Peace be upon you. welcome. Passport please.",2000));
        body_13_2.add(new LessonDetails("المسافر: هذا هو جواز السفر.","Traveler: This is a passport.",11000));
        body_13_2.add(new LessonDetails("الضابط: هل أنت ماليزي؟","Officer: Are you Malaysian?",14000));
        body_13_2.add(new LessonDetails("المسافر: لا أنا كشميري. ","Traveler: No, I'm Kashmiri.",17000));
        body_13_2.add(new LessonDetails("الضابط: هل أنت قادم للعمل؟","Officer: Are you coming to work?",20000));
        body_13_2.add(new LessonDetails("المسافر: لا، أنا قادم للزيارة والعُمرة.","Traveler: No, I'm coming to visit and Umrah.",23000));
        body_13_2.add(new LessonDetails("الضابط: كم يوماً ستقيم هنا؟","Officer: How many days will you stay here?",26500));
        body_13_2.add(new LessonDetails("المسافر: ثلاثة أسابيع تقريباً.","Traveler: Approximately three weeks.",30000));
        body_13_2.add(new LessonDetails("الضابط: أين ستقيم؟","Officer: Where will you stay?",32000));
        body_13_2.add(new LessonDetails("المسافر: سأقيم في فندق قريب من المسجد الحرام.","Traveler: I will stay at a hotel close to the Haram Mosque.",35000));
        body_13_2.add(new LessonDetails("الضابط: إقامة طيبة، وعمرة مقبولة، إن شاء الله.","Officer: a good stay, and  acceptable Umrah,ISA.",40000));
        body_13_2.add(new LessonDetails("المسافر: جزاك الله خيراً.","Traveler: God reward you good.",45000));
        //lesson 13.3
        body_13_3.add(new LessonDetails("الموظف: أهلاً وسهلاً.","Employee: Welcome",0));
        body_13_3.add(new LessonDetails("المسافر: فقدت حقيبتي.","Traveler: I lost my bag.",2000));
        body_13_3.add(new LessonDetails("الموظف: من أين أنت قادم؟","Employee: Where are you from?",3500));
        body_13_3.add(new LessonDetails("المسافر: أنا قادم من بنغلاديش.","Traveler: I am coming from Bangladesh.",5500));
        body_13_3.add(new LessonDetails("الموظف: أين الجواز؟ وأين التذكرة؟","Employee: Where is the passport? Where is the ticket?",8000));
        body_13_3.add(new LessonDetails("المسافر: هذا هو الجواز، وهذه هي التذكرة.","Traveler: This is the passport, this is the ticket.",12000));
        body_13_3.add(new LessonDetails("الموظف: ما لون الحقيبة.","Employee: What color of the bag.",19000));
        body_13_3.add(new LessonDetails("المسافر: لونها أسود.","Traveler: Black color.",21500));
        body_13_3.add(new LessonDetails("الموظف: هل هذه حقيبتك؟","Employee: Is this your bag?",24000));
        body_13_3.add(new LessonDetails("المسافر: نعم، هذه حقيبتي.","Traveler: Yes, this is my bag.",27000));
        body_13_3.add(new LessonDetails("الموظف: ماذا في الحقيبة؟","Officer: What's in the bag?",30000));
        body_13_3.add(new LessonDetails("المسافر: في الحقيبة ملابس.","المسافر: في الحقيبة ملابس.",32000));
        body_13_3.add(new LessonDetails("الموظف: افتح الحقيبة.","Employee: Open the bag.",34000));
        body_13_3.add(new LessonDetails("المسافر: نعم، هذه حقيبتي.","Traveler: Yes, this is my bag.",37000));
        //lesson 14.1
        body_14_1.add(new LessonDetails("سليم: متى العطلة يا جميل؟","Salim: When is the holiday, Jamel?",0));
        body_14_1.add(new LessonDetails("جميل: العطلة في شهر رمضان.","Jamel: Holiday in Ramadan.",3000));
        body_14_1.add(new LessonDetails("سليم: أين تقضي العطلة؟","Salim: Where you spend the holiday?",8000));
        body_14_1.add(new LessonDetails("جميل: أقضي العطلة في مكة المكرمة، والمدينة المنورة.","Jamel: I spend the holiday in Mecca, Madinah.",12000));
        body_14_1.add(new LessonDetails("سليم: كيف تقضي العطلة في مكة؟","Salim: How do you spend the holiday in Mecca?",17500));
        body_14_1.add(new LessonDetails("جميل: اعتمر وأصوم، وأصلي في المسجد الحرام.","Jamil: Umrah and fasting, and pray in the Sacred Mosque.",21000));
        body_14_1.add(new LessonDetails("سليم: وماذا تفعل في المدينة؟","Selim: And what to do in the Madinah?",27000));
        body_14_1.add(new LessonDetails("جميل: أزور المسجد النبوي.","Jamil: I visit the Prophet's Mosque.",30000));
        body_14_1.add(new LessonDetails("سليم: وأين تقضي أيام العيد؟","Salim: Where do you spend Eid?",33500));
        body_14_1.add(new LessonDetails("جميل: أقضيها في مكة أو في المدينة.","Jamil: I'll spend it in Mecca or in the Madinah.",38000));
        body_14_1.add(new LessonDetails("سليم: وماذا تفعل في مكة؟","Salim: What do you do in Mecca?",42000));
        body_14_1.add(new LessonDetails("جميل: أطوف حول الكعبة سبعة أشواط، ثم أصلي ركعتين خلف مقام إبراهيم.","Jamil: I circumnavigate the Kaaba seven times, then pray two rak'ahs behind the shrine of Abraham.",45000));
        body_14_1.add(new LessonDetails("سليم: بم تشعر في مكة والمدينة؟","Salim: What do you feel in Mecca and Medina?",52000));
        body_14_1.add(new LessonDetails("جميل: أشعر بالسرور.","Jamil: I feel happy.",55500));
        //lesson 14.2
        body_14_2.add(new LessonDetails("الابن: كيف اعتمرت يا أبي؟","Son: How did you get dressed, Dad?",0));
        body_14_2.add(new LessonDetails("الأب: وصلت إلي الميقات عند شروق الشمس.","Father: I reached the meeqaat at sunrise.",2000));
        body_14_2.add(new LessonDetails("الابن: وماذا فعلت في الميقات؟","Son: What did you do in the meeqaat?",6000));
        body_14_2.add(new LessonDetails("الأب: لبست ثوب الإحرام ولبيت بالعمرة.","Father: I wore the Ihram dress and the Applause of 'Umrah.",9000));
        body_14_2.add(new LessonDetails("الابن:  ومتي وصلت إلي المسجد الحرام؟","Son: When did you reach the Haram Mosque?",14000));
        body_14_2.add(new LessonDetails("الأب: وصلت بعد العصر.","Father: I arrived after the ASR.",18000));
        body_14_2.add(new LessonDetails("الابن:  بم شعرت في المسجد الحرام؟","Son: What did you feel in the Haram Mosque?",21000));
        body_14_2.add(new LessonDetails("الأب: شعرت بالسرور.","Father: I was pleased.",24500));
        body_14_2.add(new LessonDetails("الابن: كم شوطاً طفت حول الكعبة؟","Son: How long have you traveled around the Kaaba?",27500));
        body_14_2.add(new LessonDetails("الأب: طفت سبعة أشواط، ثم صليت ركعتين خلف مقام إبراهيم.","Father: I took seven runs, then prayed two rak'ahs behind the shrine of Abraham.",31000));
        body_14_2.add(new LessonDetails("الابن: وماذا فعلت بعد ذلك؟","Son: And what did you do then?",38000));
        body_14_2.add(new LessonDetails("الأب: سعيت بين الصفا والمروة سبعة أشواط، ثم حلقت رأسي.","Father: I tried between Safa and Marwa seven runs, then flew my head.",42000));
        body_14_2.add(new LessonDetails("الابن: وأين خلعت ثوب الإحرام؟","Son: Where did I take off the ihraam dress?",49000));
        body_14_2.add(new LessonDetails("الأب: خلعتها في الفندق.","Father: Take it off at the hotel.",52000));
        //lesson 14.3
        body_14_3.add(new LessonDetails("الرجل: متى تبدأ الوقوف بعرفة؟","Man: When do you start standing at Arafah?",0));
        body_14_3.add(new LessonDetails("عدنان: يبدأ غداً في اليوم التاسع بعد الزوال.","Adnan: Tomorrow begins on the ninth day after the demise.",2500));
        body_14_3.add(new LessonDetails("الرجل: متى ينتهي؟","Man: When does it end?",7000));
        body_14_3.add(new LessonDetails("عدنان: ينتهي عند الفجر.","Adnan: It ends at dawn.",8500));
        body_14_3.add(new LessonDetails("الرجل: هل نصلي الظهر والعصر في عرفات؟","Man: Do we pray Dhuhr and 'Asr in Arafat?",10500));
        body_14_3.add(new LessonDetails("عدنان: نعم، جمعاً وقصراً وقت الظهر.","Adnan: Yes, a group and a short time Dhuhr.",13000));
        body_14_3.add(new LessonDetails("الرجل: ومتى نذهب إلي مزدلفة؟","Man: When do we go to Muzdalifah?",17000));
        body_14_3.add(new LessonDetails("عدنان: نذهب بعد غروب الشمس، ونصلي فيها  المغرب والعشاء جمعاً وقصراً.","Adnan: We go after sunset, and we pray in Maghrib and 'Isha' together and in short.",20000));
        body_14_3.add(new LessonDetails("الرجل: وماذا نفعل بعد ذلك؟","Man: What do we do then?",27000));
        body_14_3.add(new LessonDetails("عدنان: نذهب إلي منى قبل شروق الشمس، ونرمي الجمرة الكبري، ثم نذبح الهدي، ونحلق رؤوسنا.","Adnan: We go to Mena before the sun rises, and we throw the great anthrax, then we sacrifice the gift, and we shave our heads.",30000));
        body_14_3.add(new LessonDetails("الرجل: وماذا نفعل بعد ذلك؟","Man: What do we do then?",40000));
        body_14_3.add(new LessonDetails("عدنان: نذهب إلي المسجد الحرام لطواف الإفاضة وسعي الحج.","Adnan: We go to the Haram Mosque for the tawaaf al-ifaadah and seek Hajj.",42000));
        body_14_3.add(new LessonDetails("الرجل: ومتى نطوف طواف الوداع؟","Man: When does the farewell tawaaf go?",47000));
        body_14_3.add(new LessonDetails("عدنان: بعد رمي الجمرات في اليوم الثاني عشر، أو الثالث عشر.","Adnan: After throwing stones on the twelfth day, or the thirteenth.",50000));
        //lesson 15.1
        body_15_1.add(new LessonDetails("مسعود: السلام عليكم ورحمة الله وبركاته.","Masoud: Peace, mercy and blessings of God be upon you.",0));
        body_15_1.add(new LessonDetails("محمود: وعليكم السلام ورحمة الله وبركاته.","Mahmoud: Peace, mercy and blessings of God be upon you.",5000));
        body_15_1.add(new LessonDetails("مسعود: لماذا حضرت اليوم إلي المستشفي؟","Masoud: Why did you come to the hospital today?",9000));
        body_15_1.add(new LessonDetails("محمود: حضرت لزيارة طبيب الأسنان.","Mahmoud: I came to visit the dentist.",13000));
        body_15_1.add(new LessonDetails("مسعود: بم تشعر؟","Masoud: What do you feel?",17000));
        body_15_1.add(new LessonDetails("محمود: أشعر بألم شديد في أسناني. ولماذا حضرت أنت إلي المستشفي؟","Mahmoud: I have severe pain in my teeth. Why did you come to the hospital?",20000));
        body_15_1.add(new LessonDetails("مسعود: حضرت لزيارة طبيب الأنف والأذن والحنجرة.","Masoud: I attended to see a nose, throat and ear doctor.",27000));
        body_15_1.add(new LessonDetails("محمود: بم تشعر؟","Mahmoud: What do you feel?",32000));
        body_15_1.add(new LessonDetails("مسعود: أشعر بألم شديد في أذني.","Masoud: I have a severe pain in my ear.",34000));
        body_15_1.add(new LessonDetails("محمود: هل لديك موعد مع الطبيب؟","Mahmoud: Do you have an appointment with your doctor?",38000));
        body_15_1.add(new LessonDetails("مسعود: نعم، موعدي الساعة العاشرة.","Masoud: Yes, My appointment at ten o'clock.",41000));
        body_15_1.add(new LessonDetails("محمود: موعدي الساعة العاشرة أيضاً.","Mahmoud: My appointment is at ten o'clock",44500));
        body_15_1.add(new LessonDetails("مسعود: الساعة الآن التاسعة والنصف، الباقي نصف ساعة.","Masoud: It's now 9:30, the rest is half an hour.",48000));
        //lesson 15.2
        body_15_2.add(new LessonDetails("المدرس: السلام عليكم ورحمة الله وبركاته.","Teacher: Peace, mercy and blessings of God be upon you.",0));
        body_15_2.add(new LessonDetails("الطالب: وعليكم السلام ورحمة الله وبركاته.","Student: Peace, mercy and blessings of God be upon you.",3500));
        body_15_2.add(new LessonDetails("المدرس: لماذا تغيبت عن الدراسة؟","Teacher: Why did you miss school?",8000));
        body_15_2.add(new LessonDetails("الطالب: أصبت بزكام شديد.","Student: I had a severe cold.",11000));
        body_15_2.add(new LessonDetails("المدرس: بم شعرت؟","Teacher: What did you feel?",14000));
        body_15_2.add(new LessonDetails("الطالب: شعرت بصداع شديد في الليل، وارتفعت درجة حرارتي.","Student: I felt a severe headache at night, and my temperature rose.",16000));
        body_15_2.add(new LessonDetails("المدرس: هل قابلت الطبيب؟","Teacher: Have you met the doctor?",23000));
        body_15_2.add(new LessonDetails("الطالب: نعم، ذهبت إلي المستشفي بالإسعاف، وقابلت الطبيب","Student: Yes, I went to the hospital by ambulance and met the doctor",26000));
        body_15_2.add(new LessonDetails("المدرس: وبم نصحك الطبيب؟","Teacher: What's your doctor's advice?",33000));
        body_15_2.add(new LessonDetails("الطالب: نصحني بالراحة وتناول الدواء، وهذا هو التقرير الطبي.","Student: advised me to rest and take medicine, this is the medical report.",35000));
        body_15_2.add(new LessonDetails("المدرس: شكراً لك، وبما تشعر الآن؟","Teacher: Thank you, and what do you feel now?",43000));
        body_15_2.add(new LessonDetails("الطالب: الحمد لله، أنا بخير.","Student: Praise be to Alaah, I'm fine.",47000));
        //lesson 15.3
        body_15_3.add(new LessonDetails("الزوجة: السلام عليكم ورحمة الله وبركاته.","Wife: Peace be upon you and God's mercy and blessings.",0));
        body_15_3.add(new LessonDetails("الزوج: وعليكم السلام ورحمة الله وبركاته.","Husband: Peace, mercy and blessings of God be upon you.",4000));
        body_15_3.add(new LessonDetails("الزوجة: خيراً، هل قابلت الطبيب؟","Wife: Well, have you met the doctor?",9000));
        body_15_3.add(new LessonDetails("الزوج: نعم، وفحص الصدر، والقلب، والكلية، وقاس الضغط.","Husband: Yes, check the chest, heart, kidney, and measured pressure.",13000));
        body_15_3.add(new LessonDetails("الزوجة: وما النتيجة؟","Wife: What is the result?",20000));
        body_15_3.add(new LessonDetails("الزوج: القلب سليم، والحمد لله. هناك ارتفاع قليل في الضغط والسكري.","Husband: Slim heart, thank God. There is little rise in stress and diabetes.",22000));
        body_15_3.add(new LessonDetails("الزوجة: ما سبب ذلك؟","Wife: What is the reason?",30000));
        body_15_3.add(new LessonDetails("الزوج: زيادة الوزن.","Husband: Weight gain.",32000));
        body_15_3.add(new LessonDetails("الزوجة: وماذا طلب منك الطبيب؟","Wife: What did the doctor ask you?",34000));
        body_15_3.add(new LessonDetails("الزوج: طلب مني ترك السكريات.","Husband: I was asked to leave sugars.",37000));
        body_15_3.add(new LessonDetails("الزوجة: وهل طلب منك شيئاً آخر؟","Wife: Did you ask anything else?",41000));
        body_15_3.add(new LessonDetails("الزوج: نعم، ممارسة الرياضة، وتناول الفاكهة والخضروات.","Husband: Yes, exercise, eating fruits and vegetables.",45000));
        body_15_3.add(new LessonDetails("الزوجة: شفاك الله.","Wife: God bless you.",51000));
        body_15_3.add(new LessonDetails("الزوج: آمين، شكراً لك.","Husband: Amen, thank you.",53000));
        //lesson 16.1
        body_16_1.add(new LessonDetails("الابن: كم عيداً في الإسلام يا أبي؟","Son: How feast in Islam, Dad?",0));
        body_16_1.add(new LessonDetails("الأب: في الإسلام عيدان: عيد الفطر، وعيد الأضحي.","Father: In Islam 2 feasts: Eid al-Fitr and Eid al-Adha.",4000));
        body_16_1.add(new LessonDetails("الابن: متى عيد الفطر؟","Son: When is Eid al Fitr?",11000));
        body_16_1.add(new LessonDetails("الأب: بعد شهر رمضان؛ في اليوم الأول من شوال.","Father: After the month of Ramadan; on the first day of Shawwal.",14500));
        body_16_1.add(new LessonDetails("الابن: ماذا نعمل في يوم العيد؟","Son: What do we do on Eid?",20000));
        body_16_1.add(new LessonDetails("الأب: نعطي زكاة الفطر للفقراء.","Father: We give zakaat al-fitr to the poor.",24000));
        body_16_1.add(new LessonDetails("الابن: وما زكاة الفطر؟","Son: What is zakaat al-fitr?",28000));
        body_16_1.add(new LessonDetails("الأب: صاع من طعام عن كل شخص.","Father: A bowl of food for everyone.",31500));
        body_16_1.add(new LessonDetails("الابن: وماذا نفعل بعد ذلك؟","Son: And what do we do then?",38000));
        body_16_1.add(new LessonDetails("الأب: نصلي صلاة العيد، ونزور الأهل والأصدقاء.","Father: We pray Eid prayers, and visit friends and family.",41000));
        body_16_1.add(new LessonDetails("الابن: ومتى عيد الأضحي؟","Son: When is Eid al-Adha?",47000));
        body_16_1.add(new LessonDetails("الأب: في اليوم العاشر من ذي الحجة.","Father: On the tenth day of Dhul-Hijjah.",51000));
        body_16_1.add(new LessonDetails("الابن: وماذا نفعل في عيد الأضحى؟","Son: What do you do on Eid al-Adha?",55000));
        body_16_1.add(new LessonDetails("الأب: نصلي صلاة العيد، ونذبح الأضحية، ونزور الأهل والأصدقاء.","Father: We pray the Eid prayer, slaughter the sacrifice, and visit the family and friends.",59000));
        //lesson 16.2
        body_16_2.add(new LessonDetails("أحمد: اقتربت العطلة يا أبي.","Ahmed: The holiday is coming, Dad.",0));
        body_16_2.add(new LessonDetails("الأب: ما رأيك يا ندي؟ إلي أين نسافر؟","Father: What do you think, Nada? Where do we travel?",4000));
        body_16_2.add(new LessonDetails("ندي: لدي فكرة، نسافر إلي مصر.","Nada: I have an idea, we travel to Egypt.",8000));
        body_16_2.add(new LessonDetails("أحمد: لماذا نسافر إلي مصر؟","Ahmed: Why should we travel to Egypt?",13000));
        body_16_2.add(new LessonDetails("ندي: لنري مصر، ونهر النيل.","Nada: To see Egypt, and the Nile.",16000));
        body_16_2.add(new LessonDetails("أحمد: موافق، فكرة طيبة.","Ahmed: OK, good idea.",19000));
        body_16_2.add(new LessonDetails("الأب: كيف نسافر إلي مصر؟","Father: How do we travel to Egypt?",23000));
        body_16_2.add(new LessonDetails("ندي: نسافر بالجو.","Nada: We travel by air.",25500));
        body_16_2.add(new LessonDetails("الأب: السفر بالجو غال.","Father: Traveling by air is expensive.",28000));
        body_16_2.add(new LessonDetails("أحمد: إذن نسافر بالبحر، السفر بالبحر رخيص.","Ahmed: So we travel by sea, traveling by sea is cheap.",30000));
        body_16_2.add(new LessonDetails("الأب: كم يوماً سنقضي في مصر؟","Father: How many days will we spend in Egypt?",36500));
        body_16_2.add(new LessonDetails("ندي: سبعة أيام.","Nada: Seven days.",40000));
        body_16_2.add(new LessonDetails("الأب: سبعة أيام... سبعة أيام... جميل!   نسافر يوم السبت، إن شاء الله.","Father: Seven days ... seven days ... beautiful! We travel on Saturday, God willing.",43000));
        body_16_2.add(new LessonDetails("أحمد وندي : شكراً يا أبي.","Ahmed and Nada: Thank you, Dad.",52000));
        //lesson 16.3
        body_16_3.add(new LessonDetails("المدرس: أين ستقضون عطلة الصيف يا أبنائي؟ إلي أين ستذهب أنت؟","Teacher: Where will you spend the summer vacation, my children? Where are you going?",0));
        body_16_3.add(new LessonDetails("الطالب الأول: سأقضي عطلة الصيف في القرية مع جدي المكان هناك هادئ، والهواء نقي.","First student: I will spend the summer vacation in the village with my grandfather; the place there is quiet, the air is pure.",7000));
        body_16_3.add(new LessonDetails("الطالب الثاني: سأقضي عطلة الصيف في العاصمة مع عمي  سأزور المكتبات والمتاحف.","Second student: I will spend the summer vacation in the capital with my uncle I will visit libraries and museums.",17000));
        body_16_3.add(new LessonDetails("الطالب الثالث: سأقضي عطلة الصيف بين الجبال مع فريق الجوالة.","Third student: I will spend the summer vacation between the mountains with the mobile team.",27000));
        body_16_3.add(new LessonDetails("الطالب الرابع: سأقضي العطلة في مكة والمدينة مع أسرتي  سنعتمر، ونحج، ونزور المسجد النبوي.","The fourth student: I will spend the holiday in Mecca and Medina with my family; Sunjamr, and Hajj, and visit the Prophet's Mosque.",34000));
        body_16_3.add(new LessonDetails("الطالب الخامس: سأقضي العطلة في بلدي، سأساعد والدي في المزرعة.","Student V: I'll spend my vacation in my country, I'll help my father on the farm.",44000));
        body_16_3.add(new LessonDetails("المدرس: عطلة سعيدة يا أبنائي.","Teacher: Happy holiday, my children.",49000));
        body_16_3.add(new LessonDetails("الطلاب: عطلة سعيدة يا أستاذ.","Students: Happy holiday, Professor.",52000));



        //add data to sub stories lists
        //sub stories of the story number 1
        subStories1.add(new SubStory("1.1" , "Lesson 1"));
        subStories1.add(new SubStory("1.2" , "Lesson 2"));
        subStories1.add(new SubStory("1.3" , "Lesson 3"));
        subStories1.add(new SubStory("1.4" , "Lesson 4"));
        subStories1.add(new SubStory("1.5" , "Lesson 5"));
        subStories1.add(new SubStory("1.6" , "Lesson 6"));
        //sub stories of the story number
        subStories2.add(new SubStory("2.1" , "Lesson 1"));
        subStories2.add(new SubStory("2.2" , "Lesson 2"));
        subStories2.add(new SubStory("2.3" , "Lesson 3"));
        //sub stories of the story number 3
        subStories3.add(new SubStory("3.1" , "Lesson 1"));
        subStories3.add(new SubStory("3.2" , "Lesson 2"));
        subStories3.add(new SubStory("3.3" , "Lesson 3"));
        //sub stories of the story number 4
        subStories4.add(new SubStory("4.1" , "Lesson 1"));
        subStories4.add(new SubStory("4.2" , "Lesson 2"));
        subStories4.add(new SubStory("4.3" , "Lesson 3"));
        //sub stories of the story number 5
        subStories5.add(new SubStory("5.1" , "Lesson 1"));
        subStories5.add(new SubStory("5.2" , "Lesson 2"));
        subStories5.add(new SubStory("5.3" , "Lesson 3"));
        //sub stories of the story number 6
        subStories6.add(new SubStory("6.1" , "Lesson 1"));
        subStories6.add(new SubStory("6.2" , "Lesson 2"));
        subStories6.add(new SubStory("6.3" , "Lesson 3"));
        //sub stories of the story number 7
        subStories7.add(new SubStory("7.1" , "Lesson 1"));
        subStories7.add(new SubStory("7.2" , "Lesson 2"));
        subStories7.add(new SubStory("7.3" , "Lesson 3"));
        //sub stories of the story number 8
        subStories8.add(new SubStory("8.1" , "Lesson 1"));
        subStories8.add(new SubStory("8.2" , "Lesson 2"));
        subStories8.add(new SubStory("8.3" , "Lesson 3"));
        //sub stories of the story number 9
        subStories9.add(new SubStory("9.1" , "Lesson 1"));
        subStories9.add(new SubStory("9.2" , "Lesson 2"));
        subStories9.add(new SubStory("9.3" , "Lesson 3"));
        //sub stories of the story number 10
        subStories10.add(new SubStory("10.1" , "Lesson 1"));
        subStories10.add(new SubStory("10.2" , "Lesson 2"));
        subStories10.add(new SubStory("10.3" , "Lesson 3"));
        //sub stories of the story number 11
        subStories11.add(new SubStory("11.1" , "Lesson 1"));
        subStories11.add(new SubStory("11.2" , "Lesson 2"));
        subStories11.add(new SubStory("11.3" , "Lesson 3"));
        //sub stories of the story number 12
        subStories12.add(new SubStory("12.1" , "Lesson 1"));
        subStories12.add(new SubStory("12.2" , "Lesson 2"));
        subStories12.add(new SubStory("12.3" , "Lesson 3"));
        //sub stories of the story number 13
        subStories13.add(new SubStory("13.1" , "Lesson 1"));
        subStories13.add(new SubStory("13.2" , "Lesson 2"));
        subStories13.add(new SubStory("13.3" , "Lesson 3"));
        //sub stories of the story number 14
        subStories14.add(new SubStory("14.1" , "Lesson 1"));
        subStories14.add(new SubStory("14.2" , "Lesson 2"));
        subStories14.add(new SubStory("14.3" , "Lesson 3"));
        //sub stories of the story number 15
        subStories15.add(new SubStory("15.1" , "Lesson 1"));
        subStories15.add(new SubStory("15.2" , "Lesson 2"));
        subStories15.add(new SubStory("15.3" , "Lesson 3"));
        //sub stories of the story number 13
        subStories16.add(new SubStory("16.1" , "Lesson 1"));
        subStories16.add(new SubStory("16.2" , "Lesson 2"));
        subStories16.add(new SubStory("16.3" , "Lesson 3"));
    }


    public void setStoryNumber(String storyNumber) {
        this.storyNumber = storyNumber;
    }

    public void setLessonNumber(String lessonNumber) {
        this.lessonNumber = lessonNumber;
    }

    public ArrayList<SubStory> getSubStory(){
        ArrayList<SubStory> subStories = new ArrayList<>();
        switch (storyNumber){

            case "1":
                subStories =subStories1;
                break;

            case "2":
                subStories =subStories2;
                break;


            case "3":
                subStories =subStories3;
                break;

            case "4":
                subStories =subStories4;
                break;

            case "5":
                subStories =subStories5;
                break;

            case "6":
                subStories =subStories6;
                break;

            case "7":
                subStories =subStories7;
                break;

            case "8":
                subStories =subStories8;
                break;

            case "9":
                subStories =subStories9;
                break;

            case "10":
                subStories =subStories10;
                break;

            case "11":
                subStories =subStories11;
                break;

            case "12":
                subStories =subStories12;
                break;

            case "13":
                subStories =subStories13;
                break;

            case "14":
                subStories =subStories14;
                break;

            case "15":
                subStories =subStories15;
                break;

            case "16":
                subStories =subStories16;
                break;
        }


        return subStories;
    }

    public String getAudio(){
        return audioName;
    }
    public ArrayList<LessonDetails> getStoryBody(){
        ArrayList<LessonDetails> body = new ArrayList<>();

        switch (lessonNumber){
            case "1.1":
                body = body_1_1;
                audioName = "audio_1_1.mp3";
                break;

            case "1.2":
                body = body_1_2;
                audioName = "audio_1_2.mp3";
                break;

            case "1.3":
                body = body_1_3;
                audioName = "audio_1_3.mp3";
                break;

            case "1.4":
                body = body_1_4;
                audioName = "audio_1_4.mp3";
                break;

            case "1.5":
                body = body_1_5;
                audioName = "audio_1_5.mp3";
                break;

            case "1.6":
                body = body_1_6;
                audioName = "audio_1_6.mp3";
                break;

            case "2.1":
                body = body_2_1;
                audioName = "audio_2_1.mp3";
                break;

            case "2.2":
                body = body_2_2;
                audioName = "audio_2_2.mp3";
                break;

            case "2.3":
                body = body_2_3;
                audioName = "audio_2_3.mp3";
                break;

            case "3.1":
                body = body_3_1;
                audioName = "audio_3_1.mp3";
                break;

            case "3.2":
                body = body_3_2;
                audioName = "audio_3_2.mp3";
                break;

            case "3.3":
                body = body_3_3;
                audioName = "audio_3_3.mp3";
                break;

            case "4.1":
                body = body_4_1;
                audioName = "audio_4_1.mp3";
                break;

            case "4.2":
                body = body_4_2;
                audioName = "audio_4_2.mp3";
                break;

            case "4.3":
                body = body_4_3;
                audioName = "audio_4_3.mp3";
                break;

            case "5.1":
                body = body_5_1;
                audioName = "audio_5_1.mp3";
                break;

            case "5.2":
                body = body_5_2;
                audioName = "audio_5_2.mp3";
                break;

            case "5.3":
                body = body_5_3;
                audioName = "audio_5_3.mp3";
                break;

            case "6.1":
                body = body_6_1;
                audioName = "audio_6_1.mp3";
                break;

            case "6.2":
                body = body_6_2;
                audioName = "audio_6_2.mp3";
                break;

            case "6.3":
                body = body_6_3;
                audioName = "audio_6_3.mp3";
                break;

            case "7.1":
                body = body_7_1;
                audioName = "audio_7_1.mp3";
                break;

            case "7.2":
                body = body_7_2;
                audioName = "audio_7_2.mp3";
                break;

            case "7.3":
                body = body_7_3;
                audioName = "audio_7_3.mp3";
                break;

            case "8.1":
                body = body_8_1;
                audioName = "audio_8_1.mp3";
                break;

            case "8.2":
                body = body_8_2;
                audioName = "audio_8_2.mp3";
                break;

            case "8.3":
                body = body_8_3;
                audioName = "audio_8_3.mp3";
                break;

            case "9.1":
                body = body_9_1;
                audioName = "audio_9_1.mp3";
                break;

            case "9.2":
                body = body_9_2;
                audioName = "audio_9_2.mp3";
                break;

            case "9.3":
                body = body_9_3;
                audioName = "audio_9_3.mp3";
                break;

            case "10.1":
                body = body_10_1;
                audioName = "audio_10_1.mp3";
                break;

            case "10.2":
                body = body_10_2;
                audioName = "audio_10_2.mp3";
                break;

            case "10.3":
                body = body_10_3;
                audioName = "audio_10_3.mp3";
                break;

            case "11.1":
                body = body_11_1;
                audioName = "audio_11_1.mp3";
                break;

            case "11.2":
                body = body_11_2;
                audioName = "audio_11_2.mp3";
                break;

            case "11.3":
                body = body_11_3;
                audioName = "audio_11_3.mp3";
                break;

            case "12.1":
                body = body_12_1;
                audioName = "audio_12_1.mp3";
                break;

            case "12.2":
                body = body_12_2;
                audioName = "audio_12_2.mp3";
                break;

            case "12.3":
                body = body_12_3;
                audioName = "audio_12_3.mp3";
                break;

            case "13.1":
                body = body_13_1;
                audioName = "audio_13_1.mp3";
                break;

            case "13.2":
                body = body_13_2;
                audioName = "audio_13_2.mp3";
                break;

            case "13.3":
                body = body_13_3;
                audioName = "audio_13_3.mp3";
                break;

            case "14.1":
                body = body_14_1;
                audioName = "audio_14_1.mp3";
                break;

            case "14.2":
                body = body_14_2;
                audioName = "audio_14_2.mp3";
                break;

            case "14.3":
                body = body_14_3;
                audioName = "audio_14_3.mp3";
                break;

            case "15.1":
                body = body_15_1;
                audioName = "audio_15_1.mp3";
                break;

            case "15.2":
                body = body_15_2;
                audioName = "audio_15_2.mp3";
                break;

            case "15.3":
                body = body_15_3;
                audioName = "audio_15_3.mp3";
                break;

            case "16.1":
                body = body_16_1;
                audioName = "audio_16_1.mp3";
                break;

            case "16.2":
                body = body_16_2;
                audioName = "audio_16_2.mp3";
                break;

            case "16.3":
                body = body_16_3;
                audioName = "audio_16_3.mp3";
                break;


        }

        return body;
    }



}
