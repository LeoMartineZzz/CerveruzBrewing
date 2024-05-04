package com.example.fragmentexample

import android.app.AlertDialog
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
 * Use the [tercerFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class tercerFragment : Fragment() {
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
        return inflater.inflate(R.layout.fragment_tercer, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Asigna los listeners a los botones "Ver más"
        view.findViewById<Button>(R.id.verMasEver).setOnClickListener {
            showPopup("Una cerveza sin alcohol estilo pilsner con un sabor refrescante y ligero. Conserva las características de una pilsner tradicional, como el color dorado" +
                    " claro y el aroma floral del lúpulo, pero sin el contenido de alcohol. Es una opción perfecta para aquellos que buscan disfrutar de una cerveza ligera y" +
                    " refrescante sin comprometer su sobriedad.")
        }

        view.findViewById<Button>(R.id.verMasGolden).setOnClickListener {
            showPopup("Una cerveza sin alcohol estilo pale ale con un sabor equilibrado y notas de caramelo y lúpulo. Aunque carece del contenido alcohólico de una pale ale" +
                    " tradicional, conserva su carácter maltoso y amaderado, así como un ligero amargor en el final. Es una opción ideal para aquellos que desean disfrutar de los" +
                    " sabores complejos de una pale ale sin el alcohol.")
        }

        view.findViewById<Button>(R.id.verMasVelvet).setOnClickListener {
            showPopup("Una cerveza sin alcohol estilo stout con un sabor robusto y notas de café, chocolate y tostado. Aunque no contiene alcohol, conserva la riqueza y la" +
                    " complejidad de una stout tradicional, con su cuerpo cremoso y su final suave y aterciopelado. Es una opción perfecta para aquellos que buscan una cerveza" +
                    " oscura y sabrosa sin comprometer su sobriedad.")
        }


        view.findViewById<Button>(R.id.verMasGinger).setOnClickListener {
            showPopup("Una cerveza sin alcohol con sabor a jengibre, que ofrece un equilibrio entre dulzura y picante. Con su característico aroma especiado y su sabor" +
                    " refrescante y vigorizante, la ginger beer sin alcohol es una opción popular para quienes buscan una alternativa sin alcohol con un toque de sabor único" +
                    " y estimulante.")
        }

        view.findViewById<Button>(R.id.verMasAzure).setOnClickListener {
            showPopup("Una cerveza sin alcohol estilo lager con un toque de sabor afrutado y refrescante. Su color azul brillante y su sabor ligero y equilibrado la hacen" +
                    " única entre las cervezas sin alcohol. Conserva las características de una lager tradicional, como la suavidad y la frescura, pero con un toque distintivo" +
                    " de frutas. Es una opción interesante para quienes buscan algo diferente en una cerveza sin alcohol.")
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
         * @return A new instance of fragment tercerFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            tercerFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}