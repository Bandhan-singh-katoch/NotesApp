package com.example.notesapp

import android.widget.ListAdapter

class WordListAdapter:ListAdapter<Word,WordViewHolder>(WordsComparator()) {
}