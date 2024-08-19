import React from 'react'
import './BooksPage.styles.css'
import Navbar from '../../Components/Layouts/Navbar/Navbar'
import SearchInputForm from '../../Components/Fonts/SearchInputForm/SearchInputForm'
import BookListingAll from '../../Components/Layouts/BookListingAll/BookListingAll'
import Footer from '../../Components/Layouts/Footer/Footer'

const BooksPage = () => {
  return (
    <section>
        <Navbar darkTheme={ true }/>
        <div className="search-container">
          <h2>Find The <span className="text-primary">Books</span> That You Want.</h2>
          <SearchInputForm darkTheme={false}/>

        </div>
        <BookListingAll/>
        <Footer/>
    </section>
  )
}

export default BooksPage