package com.bintang.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String mainPage() {
        return """
        <!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>bntng1nonly</title>
            <style>
                :root {
                    --background-light: #f9f9f9;
                    --text-light: #333;
                    --background-dark: #121212;
                    --text-dark: #f9f9f9;
                    --card-bg: rgba(255, 255, 255, 0.8);
                    --primary-color: #ffffff; /* Changed primary color to white */
                    --secondary-color: #2ecc71;
                    --hover-bg: rgba(255, 255, 255, 0.2);
                }

                body.light-mode {
                    background: url('/backgroundnew.jpg') no-repeat center center fixed;
                    background-size: cover;
                    color: var(--text-light);
                }

                body.dark-mode {
                    background: url('/backgroundnew.jpg') no-repeat center center fixed;
                    background-size: cover;
                    color: var(--text-dark);
                }

                body {
                    margin: 0;
                    font-family: Arial, sans-serif;
                    scroll-behavior: smooth;
                }

                header {
                    position: sticky;
                    top: 0;
                    background: none; /* Removed the dark background */
                    color: white;
                    padding: 10px 20px;
                    display: flex;
                    justify-content: space-between;
                    align-items: center;
                    z-index: 1000;
                    box-shadow: none; /* Removed any shadow */
                }

                .navbar {
                    display: flex;
                    gap: 20px;
                }

                .nav-item {
                    text-decoration: none;
                    color: white;
                    padding: 5px 10px;
                    border-radius: 5px;
                    transition: background 0.3s;
                }

                .nav-item:hover {
                    background: var(--hover-bg);
                }

                .toggle-theme {
                    cursor: pointer;
                    background: none;
                    border: none;
                    color: white;
                    font-size: 1.2em;
                }

                .social-bar {
                    display: flex;
                    gap: 15px;
                    position: absolute;
                    right: 20px; /* Positioning social icons to the top right corner */
                    top: 50%;
                    transform: translateY(-50%);
                }

                .social-icon {
                    color: white;
                    font-size: 1.5em;
                    transition: color 0.3s;
                }

                .social-icon:hover {
                    color: var(--primary-color);
                }

                section {
                    min-height: 100vh;
                    display: flex;
                    flex-direction: column;
                    justify-content: center;
                    align-items: center;
                    padding: 50px;
                    text-align: center;
                    opacity: 0;
                    animation: fadeIn 1s forwards;
                }

                section.visible {
                    opacity: 1;
                }

                .card {
                    background: var(--card-bg);
                    padding: 20px;
                    border-radius: 10px;
                    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
                    max-width: 800px;
                    width: 100%;
                    text-align: left;
                    margin: 20px 0;
                    transition: transform 0.3s ease-in-out;
                    border: 1px solid rgba(255, 255, 255, 0.4); /* More transparent border */
                }

                .card:hover {
                    transform: translateY(-10px);
                }

                .card h2 {
                    border-bottom: 2px solid rgba(255, 255, 255, 0.4); /* More transparent border */
                    padding-bottom: 10px;
                    margin-bottom: 20px;
                    color: var(--primary-color); /* Changed to white */
                    font-size: 1.5em;
                }

                .card p {
                    margin: 5px 0;
                    line-height: 1.6;
                    color: var(--text-light);
                }

                .profile img {
                    width: 500px;
                    height: 500px;
                    border-radius: 50%;
                    margin-bottom: 20px;
                    animation: fadeIn 2s;
                }

                .profile h1 {
                    font-size: 2em;
                    color: var(--primary-color); /* Changed to white */
                    margin-top: 10px;
                }

                .profile p {
                    font-size: 1.2em;
                    color: var(--text-light);
                }

                @keyframes fadeIn {
                    from {
                        opacity: 0;
                        transform: scale(0.8);
                    }
                    to {
                        opacity: 1;
                        transform: scale(1);
                    }
                }

                @keyframes cardAppear {
                    0% {
                        transform: translateY(30px);
                        opacity: 0;
                    }
                    100% {
                        transform: translateY(0);
                        opacity: 1;
                    }
                }

                .card {
                    animation: cardAppear 0.6s ease-out;
                }
            </style>
        </head>
        <body class="light-mode">
            <header>
                <div class="navbar">
                    <a href="#home" class="nav-item">Utama</a>
                    <a href="#biodata" class="nav-item">Biodata</a>
                    <a href="#cv" class="nav-item">CV</a>
                </div>
                <div class="social-bar">
                    <a href="https://www.instagram.com/bntng1nonly/profilecard/?igsh=MXR3dmYyNWdzdGJtZA==" target="_blank" class="social-icon">📸</a>
                    <a href="https://x.com/bntng1nonly?t=-VQi67hyBgTae2MIkQVqJw&s=09" target="_blank" class="social-icon">🐦</a>
                </div>
                <button class="toggle-theme" onclick="toggleTheme()">🌙</button>
            </header>

            <section id="home" class="profile">
                <img src="fotoprofil.jpeg" alt="Profile Picture">
                <h1>Muhamad Gemintang</h1>
            </section>

            <section id="biodata" class="visible">
                <div class="card">
                    <h2>Biodata</h2>
                    <p><strong>Tempat, Tanggal Lahir:</strong> Bogor, 03 Febuari 2006</p>
                    <p><strong>Alamat:</strong> Jl. Olahraga No. 26, Bogor</p>
                    <p><strong>Jenis Kelamin:</strong> Laki-laki</p>
                    <p><strong>Hobi:</strong> Fotografi</p>
                </div>
            </section>

            <section id="cv" class="visible">
                <div class="card">
                    <h2>Curriculum Vitae</h2>
                    <h3>Riwayat Pendidikan</h3>
                    <p>- S1 Teknik Informatika, Universitas Nahdlatul Ulama Indonesia (2023 - Sekarang)</p>
                    <p>- SMK BMS (2020-2023)</p>
                    <h3>Pengalaman Kerja</h3>
                    <p>- Freelance Photographer</p>
                    <p>- Freelance Videographer</p>
                    <p>- Desain Grafis</p>
                </div>
            </section>

            <script>
                function toggleTheme() {
                    const body = document.body;
                    const isLightMode = body.classList.contains('light-mode');
                    body.classList.toggle('light-mode', !isLightMode);
                    body.classList.toggle('dark-mode', isLightMode);
                }

                window.addEventListener('scroll', function() {
                    const sections = document.querySelectorAll('section');
                    sections.forEach(section => {
                        if (section.getBoundingClientRect().top < window.innerHeight) {
                            section.classList.add('visible');
                        }
                    });
                });
            </script>
        </body>
        </html>
        """;
    }
}
