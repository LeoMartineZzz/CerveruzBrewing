package com.example.fragmentexample

import android.app.AlertDialog
import android.content.Context
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [segundoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class segundoFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_segundo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Asigna los listeners a los botones "Ver más"
        view.findViewById<Button>(R.id.verMasCorona).setOnClickListener {
            showPopup("Una cerveza pale lager mexicana con un sabor suave y refrescante. Con un color dorado claro y un aroma a malta ligeramente dulce, " +
                    "esta cerveza es conocida por su carácter ligero y fácil de beber. Es perfecta para disfrutar en días calurosos o como acompañamiento de platos mexicanos.")
        }

        view.findViewById<Button>(R.id.verMasVictoria).setOnClickListener {
            showPopup("Una cerveza estilo Vienna Lager mexicana con un color ámbar profundo y un sabor maltoso y equilibrado. Presenta notas de caramelo " +
                    "y un ligero amargor floral, lo que la convierte en una opción popular entre los amantes de la cerveza en México. Es ideal para acompañar una" +
                    " amplia variedad de platillos mexicanos.")
        }

        view.findViewById<Button>(R.id.verMasPacifico).setOnClickListener {
            showPopup("Una cerveza tipo pilsner mexicana con un sabor ligero y refrescante. Con un color dorado brillante y un aroma suave a malta, esta cerveza es conocida" +
                    " por su carácter fácil de beber y su final limpio y refrescante. Es perfecta para disfrutar en cualquier momento, especialmente en climas cálidos.")
        }


        view.findViewById<Button>(R.id.verMasMnegra).setOnClickListener {
            showPopup("Una cerveza estilo Munich Dunkel mexicana con un color oscuro y un sabor rico y complejo. Presenta notas de caramelo, chocolate y frutos secos," +
                    " así como un ligero amargor en el final. Es perfecta para aquellos que buscan una cerveza con más cuerpo y carácter.")
        }

        view.findViewById<Button>(R.id.verMasMespecial).setOnClickListener {
            showPopup("Una cerveza tipo pilsner mexicana con un sabor suave y refrescante. Con un color dorado brillante y un aroma fresco a malta, esta cerveza es conocida" +
                    " por su carácter fácil de beber y su final limpio y refrescante. Es ideal para acompañar una amplia variedad de platillos mexicanos.")
        }

        view.findViewById<Button>(R.id.verMasMontejo).setOnClickListener {
            showPopup("Una cerveza tipo pilsner mexicana con un sabor suave y refrescante. Con un color dorado claro y un aroma limpio a malta, esta cerveza es perfecta para" +
                    " acompañar cualquier comida. Presenta un sabor equilibrado, con notas sutiles de lúpulo y un final refrescante. Es ideal para aquellos que buscan una cerveza" +
                    " ligera y fácil de beber.")
        }

        view.findViewById<Button>(R.id.verMasIndio).setOnClickListener {
            showPopup("Una cerveza tipo Vienna Lager mexicana con un carácter maltoso y un ligero amargor. Con un color cobrizo y un sabor suave y refrescante, esta cerveza " +
                    "es perfecta para acompañar cualquier comida mexicana. Es ideal para aquellos que buscan una cerveza tradicional y auténtica.")
        }

        // Agrega más listeners para los otros botones "Ver más" según sea necesario
    }

    private fun showPopup(texto: String) {
        val context = context
        val builder = AlertDialog.Builder(context)
        val inflater = layoutInflater
        val popupView = inflater.inflate(R.layout.pop_up_botones, null)

        // Encuentra el TextView en el layout del pop-up y establece el texto
        val textViewPopup = popupView.findViewById<TextView>(R.id.textViewPopup)
        textViewPopup.text = texto

        builder.setView(popupView)
        val dialog = builder.create()
        dialog.show()
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment segundoFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            segundoFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}