package com.duzi.tddtoysample.domain.repository

interface AnswerGenerateRepository {
    fun generateLessThanOrEqualToHundred(): IntArray
    fun generateQuiz(): Int
}