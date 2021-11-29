package com.jdvr.grupoeightunal.ui.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.jdvr.grupoeightunal.ui.activities.HomeActivity
import com.jdvr.grupoeightunal.R
import com.jdvr.grupoeightunal.databinding.FragmentLoginBinding
import com.jdvr.grupoeightunal.isValidEmail

class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        binding.loginButton.setOnClickListener {
            var isValid = true

            if (!binding.loginEmail.text.isValidEmail()){
                isValid = false
                binding.loginEmailLayou.error = " Error en la validacion de Email"
            }else{
                binding.loginEmailLayou.error = null
            }

            if (binding.loginPassword.text.toString().length < 4){
                isValid = false
                binding.loginPasswordLayout.error = " Error en la validacion Password"
            }else{
                binding.loginPasswordLayout.error = null
            }

            if (isValid){
                val intent = Intent(this.requireContext(), HomeActivity::class.java)
                startActivity(intent)
            }

        }
        binding.loginToSignupButton.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_signupFragment)
        }
    }

}