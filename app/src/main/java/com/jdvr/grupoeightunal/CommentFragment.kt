package com.jdvr.grupoeightunal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.jdvr.grupoeightunal.databinding.FragmentCommentBinding

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
        commentAdapter = CommentAdapter(
            listOf(
                Comment("1","is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard ","Javier Vergara","https://c8.alamy.com/compes/p53w62/miguel-de-cervantes-saavedra-1547-1616-escritor-y-dramaturgo-espanol-p53w62.jpg","27/11/20221"),
                Comment("2","is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard ", "Farly Artunduaga","https://1.bp.blogspot.com/-G-agGW_0QxU/WPKoJMeQJYI/AAAAAAAAA0w/FfunHAO3KzsCK7Bw2x0TNC_aAiiIbZJEgCLcB/s400/gustav%2Bschmoller.jpg","27/11/20221"),
                Comment("3","is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard ", "Camilo Fajardo","https://pymstatic.com/52669/conversions/autores-romanticismo-wide.jpg","27/11/20221"),
                Comment("4","is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard ", "Jaime de la Ossa","https://www.lifeder.com/wp-content/uploads/2018/07/486px-Goethe_Stieler_1828.jpg","27/11/20221")
            )
        )
        commentManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL,false)
        binding.commentRecycler.apply {
            adapter = commentAdapter
            layoutManager = commentManager
        }
    }

}