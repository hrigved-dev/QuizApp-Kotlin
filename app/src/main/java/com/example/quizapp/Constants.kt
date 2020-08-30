package com.example.quizapp

object Constants {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS:String = "total_questions"
    const val CORRECT_ANSWERS:String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        //Question 1
        val que1 = Question(
            1,
            "What country does this flag belong to?", R.drawable.argentina,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            1
        )
        questionsList.add(que1)

        //Question2
        val que2 = Question(
            2,
            "What country does this flag belong to?", R.drawable.australia,
            "New Zealand",
            "Russia",
            "Australia",
            "Austria",
            3
        )
        questionsList.add(que2)

        //Question3
        val que3 = Question(
            3,
            "What country does this flag belong to?", R.drawable.belgium,
            "Italy",
            "Africa",
            "Germany",
            "Belgium",
            4
        )
        questionsList.add(que3)

        //Question4
        val que4 = Question(
            4,
            "What country does this flag belong to?", R.drawable.brazil,
            "Brazil",
            "United Arab Emirates",
            "Thailand",
            "Sri Lanka",
            1
        )
        questionsList.add(que4)

        //Question5
        val que5 = Question(
            5,
            "What country does this flag belong to?", R.drawable.denmark,
            "Norway",
            "Sweden",
            "Czech Republic",
            "Denmark",
            4
        )
        questionsList.add(que5)

        //Question6
        val que6 = Question(
            6,
            "What country does this flag belong to?", R.drawable.fiji,
            "Vatican City",
            "Czech Republic",
            "Fiji",
            "Japan",
            3
        )
        questionsList.add(que6)

        //Question7
        val que7 = Question(
            7,
            "What country does this flag belong to?", R.drawable.india,
            "Italy",
            "India",
            "Libya",
            "Nigeria",
            2
        )
        questionsList.add(que7)

        //Question8
        val que8 = Question(
            8,
            "What country does this flag belong to?", R.drawable.newzealand,
            "New Zealand",
            "Russia",
            "Austria",
            "Australia",
            1
        )
        questionsList.add(que8)

        //Question9
        val que9 = Question(
            9,
            "What country does this flag belong to?", R.drawable.kuwait,
            "Dubai",
            "Yemen",
            "Oman",
            "Kuwait",
            4
        )
        questionsList.add(que9)

        //Question10
        val que10 = Question(
            10,
            "What country does this flag belong to?", R.drawable.germany,
            "Italy",
            "Germany",
            "Belgium",
            "Luxembourg",
            2
        )
        questionsList.add(que10)


        return questionsList
    }
}