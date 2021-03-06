package com.jdvr.grupoeightunal.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.jdvr.grupoeightunal.data.models.Comment
import com.jdvr.grupoeightunal.databinding.FragmentCommentBinding
import com.jdvr.grupoeightunal.ui.adapters.CommentAdapter
import com.jdvr.grupoeightunal.ui.viewmodels.CommentViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * A simple [Fragment] subclass.
 * Use the [CommentFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CommentFragment : Fragment() {

    private var _binding: FragmentCommentBinding? = null
    private val binding get() = _binding!!

    private lateinit var commentAdapter: CommentAdapter
    private lateinit var commentManager: LinearLayoutManager

    private val commentViewModel: CommentViewModel by viewModel()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_comment, container, false)
        _binding = FragmentCommentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        commentViewModel.loadComments()
        commentAdapter = CommentAdapter(
            listOf()
        )
        commentManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL,false)
        binding.commentRecycler.apply {
            adapter = commentAdapter
            layoutManager = commentManager
        }
        observeViewModels()
    }

    private  fun  observeViewModels(){
        commentViewModel.comments.observe(viewLifecycleOwner, Observer { comments ->
            commentAdapter.newDataSet(comments)
        })
    }

}