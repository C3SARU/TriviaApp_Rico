package com.example.triviaapprico

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.triviaapprico.data.QuestionBank
import com.example.triviaapprico.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        updateBestScoreDisplay()

        binding.btnStartQuiz.setOnClickListener {
            val rawName = binding.etPlayerName.text?.toString()?.trim().orEmpty()
            val playerName = rawName.ifEmpty { "Jugador" }

            val selectedCategory = when (binding.chipGroupCategory.checkedChipId) {
                R.id.chipScience -> QuestionBank.CATEGORY_SCIENCE
                R.id.chipHistory -> QuestionBank.CATEGORY_HISTORY
                R.id.chipGeneral -> QuestionBank.CATEGORY_GENERAL
                else -> QuestionBank.CATEGORY_ALL
            }

            val intent = Intent(this, QuizActivity::class.java).apply {
                putExtra(QuizActivity.EXTRA_PLAYER_NAME, playerName)
                putExtra(QuizActivity.EXTRA_CATEGORY, selectedCategory)
            }
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        updateBestScoreDisplay()
    }

    private fun updateBestScoreDisplay() {
        val prefs = getSharedPreferences(ResultActivity.PREFS_NAME, MODE_PRIVATE)
        val bestScore = prefs.getInt(ResultActivity.KEY_HIGH_SCORE, 0)
        binding.tvBestScoreHome.text = "Récord actual: $bestScore pts"
    }
}